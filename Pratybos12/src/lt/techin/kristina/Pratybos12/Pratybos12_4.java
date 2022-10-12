package lt.techin.kristina.Pratybos12;

public class Pratybos12_4 {
    public static void main(String[] args) {
        int[] numbers = {2,5,8,4,2,3};
        int sumOfNumbers = 0;
        for (int i = 0; i< numbers.length; i++) {
            sumOfNumbers += numbers[i];
        }
        double averageOfNumbers = (double) sumOfNumbers/numbers.length;
        System.out.println("Masyvo elementų suma: " + sumOfNumbers);
        System.out.println("Masyvo elementų vidurkis: " + averageOfNumbers);
    }
}
