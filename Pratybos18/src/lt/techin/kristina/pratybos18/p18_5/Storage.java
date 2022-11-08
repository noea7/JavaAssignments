package lt.techin.kristina.pratybos18.p18_5;

import java.util.LinkedList;
import java.util.List;

public class Storage {
    private static List<Product> products = new LinkedList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }
    public static Product issueProduct(int productId) {
        Product productToIssue = null;
        for (Product product : products) {
            if (product.getProductId() == productId) {
                productToIssue = product;
            }
        }
        products.remove(productToIssue);
        return productToIssue;
    }
    public static Product searchForProduct(int productId) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        System.out.println("No such product in storage");
        return null;
    }

    private static double getProductPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    private static double getProductPriceWithVat() {
        double totalPriceWithVat = 0.0;
        for (Product product : products) {
            totalPriceWithVat += product.getPriceWithVat();
        }
        return totalPriceWithVat;
    }

    public static List<Product> getProducts() {
        return products;
    }
    public static int getNumberOfProducts() {
        return products.size();
    }

}
