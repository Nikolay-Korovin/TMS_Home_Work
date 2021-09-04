package Shop;

import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Shop shop = new Shop();

    //главное меню
    private void startShop() {
        loadProducts();
        System.out.println("Добро пожаловать в меню магазина!");
        System.out.println("Что бы вы хотели сделать?(введите цифру соответствующую пункту в меню)");

        while (true) {
            int choose = 0;

            System.out.println("1. Вывести весь список товаров.");
            System.out.println("2. Добавление товара.");
            System.out.println("3. Редактирование товара.");
            System.out.println("4. Удаление товара.");
            System.out.println("5. Сохранить.");
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
                System.out.println("записали в базу");
                saveProducts();
            } else if (choose == 6) {
                System.out.println("ВЫХОД");
                saveProducts();
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
    }

    //удалить продукт
    private void deleteProduct() {
        System.out.println("удаляем товар товар");
        System.out.println("Введите id");

        System.out.print("ID: ");
        int id = getIDFromUserForChangeAndDelete();

        shop.delProdByID(id);
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
                sc.next();
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
                sc.next();
            }
        }
    }

    //ввести имя продукта
    private String getNameFromUser() {//можно ещё сделать что бы принимало через пробел
        while (true) {
            if (sc.hasNext()) {
                return sc.next();
            } else {
                System.out.println("Введите название товара");
                sc.next();
            }
        }
    }

    //ввести цену продукта
    private int getPriceFromUser() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Введите цену (цифры)");
                sc.next();
            }
        }
    }

    //проверяет есть ли такой ID
    private boolean isID(int id) {
        Optional<Product> isSomethingFind = shop.getAllProducts().stream().filter(product1 -> product1.getId() == id).findAny();
        return isSomethingFind.isPresent();
    }

    //сохранение списка товаров в файл
    private void saveProducts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Unit12/file.dat"))) {
            oos.writeObject(shop.getAllProducts());
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }
    }

    //загрузка списка товаров из файла
    private void loadProducts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Unit12/file.dat"))) {
            shop.productArrayList = (ArrayList) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Что то пошло не так");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.startShop();
    }
}