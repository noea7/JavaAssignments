package lt.techin.kristina.pratybos18.p18_5;

public class Product {
    private int productId;
    private String name;
    private double price;
    private double priceWithVat;
    private final double VAT = 0.21;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.priceWithVat = price + price * VAT;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithVat() {
        return priceWithVat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", priceWithVat=" + priceWithVat +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (Double.compare(product.priceWithVat, priceWithVat) != 0) return false;
        if (Double.compare(product.VAT, VAT) != 0) return false;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productId;
        result = 31 * result + name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(priceWithVat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(VAT);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
