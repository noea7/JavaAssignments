package lt.techin.kristina.Pratybos10;

import java.util.Scanner;

public class Pratybos10_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Puodelių, kuriuos reikia supakuoti, skaičius: ");
        int m = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println("Pilnų dėžučių skaičius: " + m/3);
        System.out.println("Nesupakuotų puodelių skaičius: " + m%3);
    }
}
