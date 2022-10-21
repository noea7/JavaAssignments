package lt.techin.kristina.Pratybos14;

import java.util.Random;

public class Pratybos14_2 {

    private static Random rnd = new Random();

    public static void main(String[] args) {

        int[] data = new int[100000];
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(10000);
        }
//        System.out.println(Arrays.toString(data));
        selectionSort(data);
//        System.out.println(Arrays.toString(data));
    }

    private static void selectionSort(int[] data) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < data.length; i++) {
            //for every index i find the minimum value of the unsorted array data[indexOfCurrentMin]
            //(from i to data.length) and place it in the data[i] slot, swapping data[i] with
            //data[indexOfCurrentMin]
            int indexOfCurrentMin = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[indexOfCurrentMin]) {
                    indexOfCurrentMin = j;
                }
            }
            int temp = data[i];
            data[i] = data[indexOfCurrentMin];
            data[indexOfCurrentMin] = temp;
        }
        long end = System.currentTimeMillis();
        System.out.println("Sorting time: " + (end-start) + "ms");
    }
}
