package lt.techin.kristina.pratybos18.p18_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProductRegistrySet {
    private static Set<Product> products = new LinkedHashSet<>();

    public static void addProduct(Product product) {
            products.add(product);
    }

    public static Set<Product> getProducts() {
        return products;
    }

    public static Product searchById (int id) {
        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }
        return null;
    }
}
