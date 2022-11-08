package lt.techin.kristina.pratybos18.p18_5;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Sony TV 42",400);
        Product product2 = new Product(2,"Beko Washing Machine - Dryer",500);
        Product product3 = new Product(3,"Playstation 5",500);
        Storage.addProduct(product1);
        Storage.addProduct(product2);
        Storage.addProduct(product3);
        System.out.println(Storage.getProducts());
        System.out.println(Storage.getNumberOfProducts());
        System.out.println(Storage.issueProduct(2));
        System.out.println(Storage.searchForProduct(5));
        System.out.println(Storage.searchForProduct(1));

    }
}
