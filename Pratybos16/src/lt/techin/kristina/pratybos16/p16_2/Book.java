package lt.techin.kristina.pratybos16.p16_2;

public class Book extends Product {
    public static final double  VAT = 0.09;

    public Book(String name, double price) {
        super(name, price);
        super.setPriceWithVAT((price+price*VAT));
    }
}
