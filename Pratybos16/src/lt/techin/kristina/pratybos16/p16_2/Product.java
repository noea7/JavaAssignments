package lt.techin.kristina.pratybos16.p16_2;

public abstract class Product {

    private String name;
    private double price;
    private double priceWithVAT;
    public static final double  VAT = 0.21;
    private double discount = 0;

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
        this.priceWithVAT = price + price * VAT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price * (1-discount);
    }

    public double getPriceWithVAT() {
        return priceWithVAT * (1-discount);
    }

    public void setPriceWithVAT(double priceWithVAT) {
        this.priceWithVAT = priceWithVAT;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", priceWithVAT=" + priceWithVAT +
                '}';
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount <= 1 && discount >= 0) {
            this.discount = discount;
        } else {
            System.out.println("Invalid discount");
        }
    }
}
