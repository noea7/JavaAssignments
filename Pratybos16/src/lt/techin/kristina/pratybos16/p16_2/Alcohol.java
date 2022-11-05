package lt.techin.kristina.pratybos16.p16_2;

public class Alcohol extends Product{

    public Alcohol(String name, double price) {
        super(name, price);
        super.setPriceWithVAT((price+price*VAT));
    }
}
