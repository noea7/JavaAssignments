package lt.techin.kristina.pratybos17.p17_5;

public class Periodical extends AbstractProduct implements ShoppingCartItem {

    private final double PERIODICAL_VAT = 0.05;

    public Periodical(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return PERIODICAL_VAT;
    }

}
