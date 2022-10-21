package lt.techin.kristina.Pratybos14;

import java.util.Random;

public class Pratybos14_3 {

    private static Random rnd = new Random();

    public static void main(String[] args) {

        int[] data = new int[1000000];
        for (int i = 0; i < data.length; i++) {
            data[i] = rnd.nextInt(10000);
        }
//        System.out.println(Arrays.toString(data));
        insertionSort(data);
//        System.out.println(Arrays.toString(data));
    }

    private static void insertionSort(int[] data) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < data.length; i++) {
//            if (data[i] < data[i-1]) {
//                for (int j = i; j > 0; j--) {
//                    if (data[j] < data[j-1]) {
//                        int temp = data[j];
//                        data[j] = data[j-1];
//                        data[j-1] = temp;
//                    }
//                }
//            }
            int valueToBeChecked = data[i];
            int j = i-1;
            while (j>=0 && data[j] > valueToBeChecked) {
                data[j+1] = data[j]; //saved the first value of data[j+1] in valueToBeChecked
                //and then move every value of data[j] that is larger than valueToBeChecked
                // one place right to data[j+1]
                j--;
            }
            data[j+1] = valueToBeChecked; //switch the last moved value with valueToBeChecked
        }
        long end = System.currentTimeMillis();
        System.out.println("Sorting time: " + (end-start) + "ms");
    }
}
