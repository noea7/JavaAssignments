package lt.techin.kristina.Pratybos12;

public class Pratybos12_5 {
    public static void main(String[] args) {
        int [] numbers = {2,5,-8,4,2,3};
        int minNumber = numbers[0];
        for (int i=1; i<numbers.length;i++){
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Mažiausias masyvo skaičius: " + minNumber);
    }
}