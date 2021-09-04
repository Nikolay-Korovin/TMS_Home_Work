package Shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Shop {
    public List<Product> productArrayList = new ArrayList<>();

    public void addProduct(Product product) {
        Optional<Product> isSomethingFind = productArrayList.stream().filter(product1 -> product1.getId() == product.getId()).findAny();
        if (isSomethingFind.isEmpty()) {
            product.setTimeOfAdd();
            productArrayList.add(product);
        }
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
