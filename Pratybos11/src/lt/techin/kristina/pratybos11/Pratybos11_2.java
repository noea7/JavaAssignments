package lt.techin.kristina.pratybos11;

import java.util.Scanner;

public class Pratybos11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek dalyvavo bėgikų: ");
        int numberOfRunners = scanner.nextInt();
        scanner.nextLine();
        int totalRunningTime = 0;
        int shortestRunningTime = 0;
        for (int i = 1; i<=numberOfRunners; i++) {
            System.out.println("Įveskite " + i + " bėgiko laiką, s: ");
            int runningTime = scanner.nextInt();
            scanner.nextLine();
            totalRunningTime += runningTime;
            if (runningTime>=0 && runningTime <= shortestRunningTime || shortestRunningTime==0) {
                shortestRunningTime = runningTime;
            }
        }
        scanner.close();
        double averageRunningTime = (double) totalRunningTime / numberOfRunners;
        System.out.println("Greičiausio bėgiko laikas: " + shortestRunningTime + " sek.");
        System.out.println("Jis buvo: " + (averageRunningTime - shortestRunningTime) + " sek geresnis už vidurkį.");
    }
}
