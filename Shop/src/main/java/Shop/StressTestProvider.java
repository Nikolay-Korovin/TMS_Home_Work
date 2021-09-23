package Shop;

import java.util.Random;

class StressTestProvider {
    Random random = new Random();
    Shop shop;
    JsonProductManager jsonProductManager = new JsonProductManager();
    String[] productNames = {"Кукуруза", "Свекла", "Тушёнка", "Морковь", "Салат", "Гамбургер", "Велосипед", "Кружка",
            "Шарик", "Сковорода", "Банка"};

    public StressTestProvider(Shop shop) {
        this.shop = shop;
    }

    public synchronized void get() {
        while (shop.productArrayList.size() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        int position = random.nextInt(shop.productArrayList.size());
        System.out.println("Покупатель купил один товар : " + shop.productArrayList.get(position).getName());
        shop.productArrayList.remove(position);
        jsonProductManager.saveProductsToJson(shop.getAllProducts());
        System.out.println("Товаров на складе : " + shop.productArrayList.size());
        notify();
    }

    public synchronized void put() {
        while (shop.productArrayList.size() >= 10) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        shop.addProduct(new Product(random.nextInt(200), productNames[random.nextInt(productNames.length)], random.nextInt(400)));
        jsonProductManager.saveProductsToJson(shop.getAllProducts());
        if (shop.productArrayList.size() != 0) {
            System.out.println("Производитель добавил один товар : " + shop.productArrayList.get(shop.productArrayList.size() - 1).getName());
        }
        System.out.println("Товаров в магазине " + shop.productArrayList.size());
        notify();
    }
}

class Producer implements Runnable {
    StressTestProvider stressTestProvider;

    Producer(StressTestProvider stressTestProvider) {
        this.stressTestProvider = stressTestProvider;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            stressTestProvider.put();
        }
    }
}

class Consumer implements Runnable {
    StressTestProvider stressTestProvider;

    Consumer(StressTestProvider stressTestProvider) {
        this.stressTestProvider = stressTestProvider;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            stressTestProvider.get();
        }
    }
}