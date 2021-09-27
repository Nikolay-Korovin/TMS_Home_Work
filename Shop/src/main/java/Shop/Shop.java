package Shop;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    public Shop(){}
    @JsonProperty("Shop")
    public List<Product> productArrayList = new ArrayList<>();

    public void addProduct(Product product) {
        product.setTimeOfAdd(LocalDateTime.now());
        productArrayList.add(product);
    }

    public List<Product> getAllProducts() {
        return productArrayList;
    }

    public void delProdByID(int id) {
        productArrayList.removeIf(p -> p.getId() == id);
    }

    public Product getProduct(int index) {
        return productArrayList.get(index);
    }

    public void changeProduct(Product product) {
        productArrayList.stream()
                .filter(product1 -> product1.getId() == product.getId())
                .forEach(product1 -> {
                    product1.setPrice(product.getPrice());
                    product1.setName(product.getName());
                });
    }

}
