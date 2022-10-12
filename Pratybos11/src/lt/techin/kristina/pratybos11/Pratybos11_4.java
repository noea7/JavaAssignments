package lt.techin.kristina.pratybos11;

import java.util.Scanner;

public class Pratybos11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite kiek autobusų vyksta kasdien: ");
        int numberOfBuses = scanner.nextInt();
        scanner.nextLine();
        int totalTimeOfTravel = 0;
        int totalNumberOfPassengers = 0;
        int numberOfUnpopularBusses = 0;
        for (int i=1; i <= numberOfBuses; i++) {
            System.out.println(i + " autobuso važiavimo laikas (val.):");
            int timeOfTravel = scanner.nextInt() * 60;
            scanner.nextLine();
            System.out.println(i + " autobuso važiavimo laikas (min.):");
            timeOfTravel += scanner.nextInt();
            totalTimeOfTravel += timeOfTravel;
            scanner.nextLine();
            System.out.println(i + " autobusas perveža keleivių: ");
            int numberOfPassengers = scanner.nextInt();
            scanner.nextLine();
            totalNumberOfPassengers+=numberOfPassengers;
            if (numberOfPassengers<10) {
                numberOfUnpopularBusses++;
            }
        }
        scanner.close();
        System.out.println("Bendrai pervežtų keleivių skaičius = " + totalNumberOfPassengers);
        System.out.println("Vidutinis sugaištas važiavimo laikas (min.): " + (totalTimeOfTravel/numberOfBuses));
        System.out.println("Autobusų skaičius (keleiviai < 10): " + numberOfUnpopularBusses);
    }
}
