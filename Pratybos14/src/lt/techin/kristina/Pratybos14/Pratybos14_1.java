package lt.techin.kristina.Pratybos14;

import java.util.Random;

public class Pratybos14_1 {

    private static Random rnd = new Random();

    public static void main(String[] args) {

        int[] data = new int[100000];
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(10000);
        }
//        System.out.println(Arrays.toString(data));
        bubbleSort(data);
//        System.out.println(Arrays.toString(data));
    }

    private static void bubbleSort(int[] data) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                if (data[j] < data[j-1]) {
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Sorting time: " + (end-start) + "ms");
    }
}
