package lt.techin.kristina.pratybos16.p16_2;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        FoodProduct apple = new FoodProduct("Apple", 0.5);
        cart.addToCart(apple);
        System.out.println(cart.getTotalPrice());
        Alcohol beer = new Alcohol("Beer", 1.2);
        cart.addToCart(beer);
        System.out.println(cart.getTotalPrice());
        beer.setDiscount(0.2);
        System.out.println(beer.getPrice());
        System.out.println(cart.getTotalPrice());
        Book aBook = new Book("Twilight book", 10.50);
        cart.addToCart(aBook);
        Periodical nyTimes = new Periodical("New York Times", 5.70);
        cart.addToCart(nyTimes);
        System.out.println(cart.getTotalPrice());
        System.out.println(cart.getTotalPriceWithVAT());
        System.out.println(cart.getTotalPriceUSD());
    }
}
