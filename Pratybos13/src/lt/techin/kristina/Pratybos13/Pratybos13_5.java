package lt.techin.kristina.Pratybos13;

import java.util.Arrays;

public class Pratybos13_5 {
    public static void main(String[] args) {
        int[] data = {1,45,1,3,3,98,15,-3,-3};
        System.out.println("Pradinis masyvas: " + Arrays.toString(data));
        System.out.println("Atrinktų unikalių skaičių masyvas: " + Arrays.toString(selectUnique(data)));
    }

    private static int[] selectUnique(int[] data) {
        boolean isUnique = true;
        int[] selectedData = new int[data.length];
        int indexOfSelectedData = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                selectedData[indexOfSelectedData] = data[i];
                indexOfSelectedData++;
            }
            isUnique = true;
        }
        int[] result = new int[indexOfSelectedData];
        for (int k = 0; k < indexOfSelectedData; k++) {
            result[k] = selectedData[k];
        }
        return result;
    }
}
