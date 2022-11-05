package lt.techin.kristina.pratybos16.p16_2;

public class Cart {
    private Product[] itemsInCart = new Product[1000];
    private int productCount = 0;
    private static final double EURTOUSD = 1;

    public void addToCart (Product product){
        if (product != null) {
            itemsInCart[productCount] = product;
            productCount++;
            System.out.println(product.getName() + " added to cart for " + product.getPrice() + " eur.");
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i=0; i < productCount; i++) {
            totalPrice += itemsInCart[i].getPrice();
        }
        System.out.println("Total price without VAT is " + totalPrice + " eur.");
        return totalPrice;
    }

    public double getTotalPriceWithVAT() {
        double totalPriceWithVAT = 0;
        for (int i=0; i < productCount; i++) {
            totalPriceWithVAT += itemsInCart[i].getPriceWithVAT();
        }
        System.out.println("Total price with VAT is " + totalPriceWithVAT + " eur.");
        return totalPriceWithVAT;
    }

    public double getTotalPriceUSD() {
        double totalPriceUSD = 0;
        for (int i=0; i < productCount; i++) {
            totalPriceUSD += itemsInCart[i].getPriceWithVAT()*EURTOUSD;
        }
        System.out.println("Total price with VAT is " + totalPriceUSD + " usd.");
        return totalPriceUSD;
    }
}
