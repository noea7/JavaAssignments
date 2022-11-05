package lt.techin.kristina.pratybos17.p17_5;

public class Medicine extends AbstractProduct implements ShoppingCartItem {

    private final double MEDICINE_VAT = 0.05;

    public Medicine(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return MEDICINE_VAT;
    }

}
