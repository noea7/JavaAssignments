package lt.techin.kristina.pratybos16.p16_2;

public class Periodical extends Product {
    public static final double  VAT = 0.05;

    public Periodical(String name, double price) {
        super(name, price);
        super.setPriceWithVAT((price+price*VAT));
    }
}
