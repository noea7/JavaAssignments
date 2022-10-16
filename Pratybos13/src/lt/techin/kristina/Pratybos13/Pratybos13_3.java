package lt.techin.kristina.Pratybos13;

import java.util.Arrays;

public class Pratybos13_3 {
    public static void main(String[] args) {
        int[] data = {23,45,12,3,78,98,15,-3};
        System.out.println("Pradinis masyvas: " + Arrays.toString(data));
        System.out.println("Atrinktų skaičių masyvas: " + Arrays.toString(selectEvenNumbers(data)));
    }

    private static int[] selectEvenNumbers(int[] data) {
        int evenNumberCount = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenNumberCount++;
            }
        }
        int[] evenNumbers = new int[evenNumberCount];
        int evenNumberIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                evenNumbers[evenNumberIndex] = data[i];
                evenNumberIndex++;
            }
        }
        return evenNumbers;
    }
}
