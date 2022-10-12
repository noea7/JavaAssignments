package lt.techin.kristina.Pratybos10;

import java.util.Scanner;

public class Pratybos10_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koks automobilio greitis?: ");
        double v = scanner.nextDouble();
        scanner.nextLine();
        scanner.close();
        double speedMPerS = v * 1000 / 3600;
        double duration = 264 / speedMPerS;
        System.out.printf("Automobilis tunelį pravažiuos per: %.2f", duration);
        System.out.print(" s");
    }
}
