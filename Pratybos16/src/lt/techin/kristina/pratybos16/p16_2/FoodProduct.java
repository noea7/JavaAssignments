package lt.techin.kristina.pratybos16.p16_2;

public class FoodProduct extends Product {

    public FoodProduct(String name, double price) {
        super(name, price);
        super.setPriceWithVAT((price+price*VAT));
    }

}
