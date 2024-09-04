package sesion9.ejemploGenerics;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {

    private List<Product<T>> products = new ArrayList<>();

    public void addProduct(Product<T> product) {
        products.add(product);
    }

    public Product<T> getproductById(T id) {
        for (Product<T> product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public void listProduct() {
        for (Product<T> product : products) {
            System.out.println(product);
        }
    }
}
