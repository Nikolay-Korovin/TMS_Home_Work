package Unit12;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Shop shop = new Shop(new ArrayList<>());

    //главное меню
    public void startShop() {

        System.out.println("Добро пожаловать в меню магазина!");
        System.out.println("Что бы вы хотели сделать?(введите цифру соответствующую пункту в меню)");

        while (true) {
            int choose = 0;

            System.out.println("1. Вывести весь список товаров.");
            System.out.println("2. Добавление товара.");
            System.out.println("3. Редактирование товара.");
            System.out.println("4. Удаление товара.");
            System.out.println("5. Выход.");

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
                System.out.println("ВЫХОД");
                break;
            } else {
                System.out.println("Введите корректный номер из меню");
            }
        }
    }
    //выбор вариантов сортировки перед показом всего магазина
    public void showAllProducts() {
        int choose = 0;

        while (true) {
            System.out.println("Как сортируем?");
            System.out.println("1. По цене (возрастание).");
            System.out.println("2. По цене (убывание).");
            System.out.println("3. По дате добавления.");
            System.out.println("4. Назад.");

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
                System.out.println("выводим по дате добавления");
                Product.dateSort(shop.getAllProducts());
                break;
            } else if (choose == 4) {
                System.out.println("ВЫХОД");
                break;
            } else {
                System.out.println("Введите корректный номер из меню");
            }
        }
    }
    //изменить продукт по ID
    public void changeProduct() {
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
    public void addProduct() {
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
    public void deleteProduct() {
        System.out.println("удаляем товар товар");
        System.out.println("Введите id");

        System.out.print("ID: ");
        int id = getIDFromUserForChangeAndDelete();

        shop.delProdByID(id);
    }
    //запрос айди для метода (добавить продукт)
    public int getIDFromUserForAdd() {
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
    public int getIDFromUserForChangeAndDelete() {
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
    public String getNameFromUser() {//можно ещё сделать что бы принимало через пробел
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
    public int getPriceFromUser() {
        while (true) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Введите цену (цифры)");
                sc.next();
            }
        }
    }
    //существует ли такой айди?
    public boolean isID(int id) {
        for (Product product : shop.getAllProducts()) {
            if (product.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.shop.addProduct(new Product(1, "а", 1000));
        menu.shop.addProduct(new Product(2, "б", 10));
        menu.shop.addProduct(new Product(3, "в", 1));
        menu.startShop();
    }
}
