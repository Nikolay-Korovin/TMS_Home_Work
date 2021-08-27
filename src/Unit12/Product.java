package Unit12;


import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int price;
    private LocalDateTime dateOfAdd;

    public Product() { }
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
    public void setTimeOfAdd() {
        this.dateOfAdd = LocalDateTime.now();
    }

    public static void priceSortUP(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getPrice));
        System.out.println(product);
        System.out.println();
    }
    public static void priceSortDOWN(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println(product);
        System.out.println();
    }
    public static void dateSort(final List<Product> product) {
        product.sort(Comparator.comparing(Product::getTimeOfAdd).reversed());
        System.out.println(product);
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

    @Override
    public int compareTo(Product product) {
        return 0;
    }
}
