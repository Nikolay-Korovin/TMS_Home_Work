package Shop;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;


public class Product implements Serializable {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("price")
    private int price;
    @JsonProperty("timeOfAdd")
    private LocalDateTime dateOfAdd;

    public Product(){

    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

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

    public void setTimeOfAdd(LocalDateTime localDate) {
        this.dateOfAdd = localDate;
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
                .filter(product -> product.getPrice() >= lowPrice)
                .filter(product -> product.getPrice() <= highPrice)
                .forEach(System.out::println);
    }

    public static void dateSort(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getTimeOfAdd).reversed());
        product.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", timeOfAdd=" + dateOfAdd + '}';
    }
}
