package lt.techin.kristina.pratybos18.p18_2;

import java.util.ArrayList;
import java.util.List;

public class ProductRegistryList {
    private static List<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        if (products.contains(product)) {
            System.out.println("Product " + product.getProductName() + " " + product.getProductId() +
                    " is already in registry");
        } else {
            products.add(product);
        }
    }

    public static Product searchById (int id) {
        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }

    public static List<Product> getProducts() {
        return products;
    }
}
