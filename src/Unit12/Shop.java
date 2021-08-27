package Unit12;

import java.util.ArrayList;
import java.util.Date;

public class Shop {
    private ArrayList<Product> productArrayList;

    public Shop(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void addProduct(Product product) {
        boolean condition = false;
        for (Product product1 : productArrayList) {
            if (product1.getId() == product.getId()) {
                condition = true;
                break;
            }
        }
        if (!condition) {
            product.setTimeOfAdd();
            productArrayList.add(product);
        }
    }

    public ArrayList<Product> getAllProducts() {
        return productArrayList;
    }

    public void delProdByID(int id) {
        int index = 0;
        for (Product product : productArrayList) {
            if (product.getId() == id) {
                productArrayList.remove(index);
                break;
            }
            index++;
        }
    }

    public Product getProduct(int index) {
        return productArrayList.get(index);
    }

    public void changeProduct(Product product) {
        int index = 0;
        for (Product p : productArrayList) {
            if (p.getId() == product.getId()) {
                getProduct(index).setPrice(product.getPrice());
                getProduct(index).setName(product.getName());
                break;
            }
            index++;
        }

    }
}
