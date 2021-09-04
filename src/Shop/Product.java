package Shop;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;


public class Product implements Serializable {
    private int id;
    private String name;
    private int price;
    private LocalDateTime dateOfAdd;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getTimeOfAdd() {
        return dateOfAdd;
    }
    //почему то не получилось в скобках сделать LocalDateTime.now() не видит .now
    public void setTimeOfAdd() {
        this.dateOfAdd = LocalDateTime.now();
    }

    public static void priceSortUP(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getPrice));
        product.forEach(System.out::println);
        System.out.println();
    }

    public static void priceSortDOWN(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getPrice).reversed());
        product.forEach(System.out::println);
        System.out.println();
    }

    public static void priceSortChoose(final List<Product> products, int lowPrice, int highPrice) {

        products.stream()
                .filter(product -> product.getPrice() >= lowPrice && product.getPrice() <= highPrice)
                .forEach(System.out::println);
    }

    public static void dateSort(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getTimeOfAdd).reversed());
        product.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", timeOfAdd=" + dateOfAdd +
                '}';
    }
}
