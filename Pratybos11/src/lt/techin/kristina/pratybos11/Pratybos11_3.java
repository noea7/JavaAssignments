package lt.techin.kristina.pratybos11;

import java.util.Scanner;

public class Pratybos11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite kuro bako talpą: ");
        int fuelAmmount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Įveskite kuro sąnaudas n: ");
        int fuelConsumption = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        int daysOfTravel = 0;
        boolean isEvenDay = false;
        while (fuelAmmount>0) {
            if (isEvenDay) {
                fuelAmmount -= fuelConsumption;
            } else {
                fuelAmmount -= (2*fuelConsumption);
            }
            isEvenDay = !isEvenDay;
            if (fuelAmmount>=0) {
                daysOfTravel++;
            }
        }
        System.out.println("Keliauti bus galima " + daysOfTravel + " dienas.");
    }
}
