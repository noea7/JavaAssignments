package lt.techin.kristina.Pratybos12;

public class Pratybos12_1 {
    public static void main(String[] args) {
        double[] productPrices = {102.56, 215.72, 99.21, 200, 175.99, 214.99};
        double totalSum = 0;
        for (int i = 0; i<productPrices.length; i++){
            totalSum += productPrices[i];
        }
        double priceAverage = totalSum/productPrices.length;
        System.out.printf("Vidutiniškai viena prekė kainavo %.2f",priceAverage);
        System.out.println(" Eur");
        System.out.printf("Per dieną pardavė prekių už %.2f", totalSum);
        System.out.println(" Eur");
    }
}
