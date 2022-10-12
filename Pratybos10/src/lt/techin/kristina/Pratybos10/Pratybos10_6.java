package lt.techin.kristina.Pratybos10;

import java.util.Scanner;

public class Pratybos10_6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek žuvų gyvena akvariume? ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kiek žuvų į akvariumą įdedama kiekvieną dieną? ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kiek dienų praėjo? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println("Po " + n + " dienų akvariume gyvens " + (a + b * n) + " žuvų");
    }
}
