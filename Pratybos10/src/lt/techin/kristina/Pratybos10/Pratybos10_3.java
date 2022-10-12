package lt.techin.kristina.Pratybos10;

import java.util.Scanner;

public class Pratybos10_3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sienos ilgis, m: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sienos aukštis, m:");
        int h = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Plytos kaina Eur: ");
        double k = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        int numberOfBricksHorizontal = a * 100 / 20;
//        if ((a*100/20)%20 != 0) {
//            numberOfBricksHorizontal++;
//        }
        int numberOfBricksVertical = h * 100 / 10;
//        if ((h*100/10)%10 !=0) {
//            numberOfBricksVertical++;
//        }
        int numberOfBricks = numberOfBricksHorizontal * numberOfBricksVertical;
        System.out.println("Plytu kiekis: " + numberOfBricks);
        double priceOfBricks = numberOfBricks * k;
        System.out.printf("Kaina: %.2f",priceOfBricks);
        System.out.print(" Eur");
    }
}
