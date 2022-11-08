package lt.techin.kristina.pratybos18.p18_2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1234567,"Apple");
        Product product2 = new Product(1234568,"Cheese");
        Product product3 = new Product(1234568,"Cheese");
        System.out.println("List registry: ");
        ProductRegistryList.addProduct(product1);
        ProductRegistryList.addProduct(product2);
        ProductRegistryList.addProduct(product3);
        System.out.println(ProductRegistryList.getProducts());
        System.out.println(ProductRegistryList.searchById(1234567));
        System.out.println(ProductRegistryList.searchById(1234569));

        System.out.println("Set registry: ");
        ProductRegistrySet.addProduct(product1);
        ProductRegistrySet.addProduct(product2);
        ProductRegistrySet.addProduct(product3);
        System.out.println(ProductRegistrySet.getProducts());
        System.out.println(ProductRegistrySet.searchById(1234567));
        System.out.println(ProductRegistrySet.searchById(1234569));

        System.out.println("Map registry: ");
        ProductRegistryMap.addProduct(product1);
        ProductRegistryMap.addProduct(product2);
        ProductRegistryMap.addProduct(product3);
        System.out.println(ProductRegistryMap.getProducts());
        System.out.println(ProductRegistryMap.searchById(1234567));
        System.out.println(ProductRegistryMap.searchById(1234569));
    }
}
