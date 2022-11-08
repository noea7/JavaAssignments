package lt.techin.kristina.pratybos18.p18_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProductRegistryMap {
    private static Map<Integer,Product> products = new LinkedHashMap();

    public static void addProduct(Product product) {
        products.put(product.getProductId(),product);
    }

    public static Map<Integer,Product> getProducts() {
        return products;
    }

    public static Product searchById (int id) {
            return products.get(id);
    }
}
