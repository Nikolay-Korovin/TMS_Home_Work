package Shop;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Shop shop = new Shop();
    JsonProductManager jsonProductManager = new JsonProductManager();

    //главное меню
    private void startShop() {
        shop.productArrayList = jsonProductManager.loadProductsFromJson();
        System.out.println("Добро пожаловать в меню магазина!");
        System.out.println("Что бы вы хотели сделать?(введите цифру соответствующую пункту в меню)");

        while (true) {
            int choose = 0;

            System.out.println("1. Вывести весь список товаров.");
            System.out.println("2. Добавление товара.");
            System.out.println("3. Редактирование товара.");
            System.out.println("4. Удаление товара.");
            System.out.println("5. Имитация деятельности.");
            System.out.println("6. Выйти.");

            if (sc.hasNextInt()) {
                choose = sc.nextInt();
            } else {
                sc.next();
            }

            if (choose == 1) {
                showAllProducts();
            } else if (choose == 2) {
                addProduct();
            } else if (choose == 3) {
                changeProduct();
            } else if (choose == 4) {
                deleteProduct();
            } else if (choose == 5) {
                sellBuyImitation();
            } else if (choose == 6) {
                System.out.println("ВЫХОД");
                break;
            } else {
                System.out.println("Введите корректный номер из меню");
            }
        }
    }

    //выбор вариантов сортировки перед показом всего магазина
    private void showAllProducts() {
        int choose = 0;

        while (true) {
            System.out.println("Как сортируем?");
            System.out.println("1. По цене (возрастание).");
            System.out.println("2. По цене (убывание).");
            System.out.println("3. По цене (выбрать от и до).");
            System.out.println("4. По дате добавления.");
            System.out.println("5. Назад.");

            if (sc.hasNextInt()) {
                choose = sc.nextInt();
            } else {
                sc.next();
            }

            if (choose == 1) {
                System.out.println("выводим по цене возрастание");
                Product.priceSortUP(shop.getAllProducts());
                break;
            } else if (choose == 2) {
                System.out.println("выводим по цене убывание");
                Product.priceSortDOWN(shop.getAllProducts());
                break;
            } else if (choose == 3) {
                System.out.println("выводим по цене (введите нижнюю и верхнюю границы цен)");
                System.out.print("от: ");
                int lowPrice = getPriceFromUser();
                System.out.print("до: ");
                int highPrice = getPriceFromUser();
                Product.priceSortChoose(shop.getAllProducts(), lowPrice, highPrice);
                break;
            } else if (choose == 4) {
                System.out.println("выводим по дате добавления");
                Product.dateSort(shop.getAllProducts());
                break;
            } else if (choose == 5) {
                System.out.println("выходим в главное меню");
                break;
            } else {
                System.out.println("Введите корректный номер из меню");
            }
        }
    }

    //изменить продукт по ID
    private void changeProduct() {
        System.out.println("редактируем товар по id");
        System.out.println("Введите id, новое название, новую цену");

        System.out.print("ID: ");
        int id = getIDFromUserForChangeAndDelete();
        System.out.print("имя: ");
        String name = getNameFromUser();
        System.out.print("цена: ");
        int price = getPriceFromUser();

        shop.changeProduct(new Product(id, name, price));
        jsonProductManager.saveProductsToJson(shop.getAllProducts());
    }

    //добавить продукт
    private void addProduct() {
        System.out.println("Добавляем товар");
        System.out.println("Введите id, название, цену");

        System.out.print("ID: ");
        int id = getIDFromUserForAdd();
        System.out.print("имя: ");
        String name = getNameFromUser();
        System.out.print("цена: ");
        int price = getPriceFromUser();

        shop.addProduct(new Product(id, name, price));
        jsonProductManager.saveProductsToJson(shop.getAllProducts());
    }

    //удалить продукт
    private void deleteProduct() {
        System.out.println("удаляем товар товар");
        System.out.println("Введите id");

        System.out.print("ID: ");
        int id = getIDFromUserForChangeAndDelete();

        shop.delProdByID(id);
        jsonProductManager.saveProductsToJson(shop.getAllProducts());
    }

    //запрос айди для метода (добавить продукт)
    private int getIDFromUserForAdd() {
        int tempID;

        while (true) {
            int id;
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                tempID = id;
                if (!isID(tempID)) {
                    return id;
                } else {
                    System.out.println("Такой айди уже существует");
                    System.out.print("ID: ");
                }
            } else {
                System.out.println("Введите ID (цифры)");
                sc = new Scanner(System.in);
            }
        }
    }

    //запрос айди для методов(изменить удалить продукт)
    private int getIDFromUserForChangeAndDelete() {
        int tempID;

        while (true) {
            int id;
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                tempID = id;
                if (isID(tempID)) {
                    return id;
                } else {
                    System.out.println("Такой айди не найден");
                    System.out.println("Повторите попытку");
                }
            } else {
                System.out.println("Введите ID (цифры)");
                sc = new Scanner(System.in);
            }
        }
    }

    //ввести имя продукта
    private String getNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Введите название товара (Слово слово... цифра)");
        while (true) {
            name = scanner.nextLine();
            if (isCorrectProductName(name)) {
                break;
            } else {
                System.out.println("Введите название товара корректно");
            }
        }
        return name.trim();
    }

    //ввести цену продукта
    private int getPriceFromUser() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Введите цену (цифры)");
                sc = new Scanner(System.in);
            }
        }
    }

    //проверяет есть ли такой ID
    public boolean isID(int id) {
        return shop.getAllProducts()
                .stream()
                .anyMatch(product1 -> product1.getId() == id);
    }

    //проверка на правильный формат названия товара
    private boolean isCorrectProductName(String name) {
        int end = 0;
        Pattern pattern = Pattern.compile("^[А-ЯЁA-Z][а-яёa-z]?\\s?([а-яёa-z]+\\s?)*([0-9]+\\s?)*");
        Matcher matcher = pattern.matcher(name.trim());
        while (matcher.find()) {
            end = matcher.end();
        }
        return name.length() == end;
    }

    //создание и удаление случайных товаров и запись в json
    private void sellBuyImitation() {
        StressTestProvider stressTestProvider = new StressTestProvider(shop);
        Producer p = new Producer(stressTestProvider);
        Consumer c = new Consumer(stressTestProvider);
        new Thread(p).start();
        new Thread(c).start();
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startShop();
    }
}
