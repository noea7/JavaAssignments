package lt.techin.kristina.pratybos11;

import java.util.Scanner;

public class Pratybos11_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek eglučių atvežta? ");
        int numberOfTrees = scanner.nextInt();
        scanner.nextLine();
        int heightOfTrees = 0;
        for (int i = 1; i<=numberOfTrees; i++) {
            System.out.println("Įveskite " + i + " eglutės aukštį: ");
            heightOfTrees += scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        double heightAverage = (double) heightOfTrees / numberOfTrees;
        System.out.println("Eglutės aukščio vidurkis: " + heightAverage);
    }
}
