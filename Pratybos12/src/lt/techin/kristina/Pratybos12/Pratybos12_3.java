package lt.techin.kristina.Pratybos12;

import java.util.Scanner;

public class Pratybos12_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek moliūgų turite: ");
        int numberOfPumpkins = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Koks yra mažiausias priimamų moliūgų svoris: ");
        double minWeight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Koks yra didžiausias priimamų moliūgų svoris: ");
        double maxWeight = scanner.nextDouble();
        scanner.nextLine();
        double totalWeight = 0;
        double totalWeightOfSelected = 0;
        int numberOfSelectedPumpkins = 0;
        for (int i=1; i<=numberOfPumpkins; i++) {
            System.out.println("Įveskite " + i + " moliūgo svorį: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            totalWeight += weight;
            if (weight<=maxWeight && weight>=minWeight) {
                totalWeightOfSelected +=weight;
                numberOfSelectedPumpkins++;
            }
        }
        double averageWeight = totalWeight / numberOfPumpkins;
        double averageSelectedWeight = totalWeightOfSelected / numberOfSelectedPumpkins;
        System.out.printf("Visų moliūgų vidutinis svoris: %.2f", averageWeight);
        System.out.println(" kg.");
        System.out.println("Į supirkimą atrinkta moliūgų: " + numberOfSelectedPumpkins);
        System.out.printf("Vidutinis vieno atrinkto moliūgo svoris: %.2f",averageSelectedWeight);
        System.out.print(" kg.");
        scanner.close();
    }
}
