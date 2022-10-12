package lt.techin.kristina.Pratybos10;

import java.util.Scanner;

public class Pratybos10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek paskaitų yra pirmadienį?");
        int pirmad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kiek paskaitų yra antradienį?");
        int antrad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kiek paskaitų yra trečiadienį?");
        int treciad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kiek paskaitų yra ketvirtadienį?");
        int ketvirtad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kiek paskaitų yra penktadienį?");
        int penktad = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        int viso = pirmad + antrad + treciad + ketvirtad + penktad;
        System.out.println("Paskaitų skaičius per savaitę: " + viso);
        System.out.println("Tai sudaro " + viso * 45 + " valandų");
    }

}
