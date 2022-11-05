package lt.techin.kristina.pratybos17.p17_5;

public class Product extends AbstractProduct implements ShoppingCartItem{
    private final double VAT = 0.21;
    public Product(String name, double price) {
        super(name, price);
    }

    @Override
    public double getVat() {
        return VAT;
    }
}
