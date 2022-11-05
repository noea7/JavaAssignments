package lt.techin.kristina.pratybos17.p17_5;

public abstract class AbstractProduct {
    private String name;
    private double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithVat() {
        return this.price * (1 + this.getVat());
    }
    public abstract double getVat();
}
