package lt.techin.kristina.Pratybos14;

import java.util.Arrays;
import java.util.Random;

public class Pratybos14_4 {

    private static Random rnd = new Random();

    public static void main(String[] args) {

        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(10000);
        }
        System.out.println(Arrays.toString(data));
        quickSort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void quickSort(int[] data) {

    }
}
