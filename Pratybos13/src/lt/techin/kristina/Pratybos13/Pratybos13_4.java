package lt.techin.kristina.Pratybos13;

import java.util.Arrays;

public class Pratybos13_4 {
    public static void main(String[] args) {
        int[] additionalData = {23,45,12,3,78,98,15,-3};
        int[] mainData = {2,12,24,15,48,64,-5,65};
        System.out.println("Pradinis masyvas Nr. 1: " + Arrays.toString(additionalData));
        System.out.println("Pradinis masyvas Nr. 2: " + Arrays.toString(mainData));
        System.out.println("Atrinktų skaičių masyvas: " + Arrays.toString(selectDistinct(mainData, additionalData)));
    }

    private static int[] selectDistinct(int[] mainData, int[] additionalData) {
        int[] selectedData = new int[mainData.length];
        int indexOfSelectedData = 0;
        boolean isUnique = true;
        for (int i = 0; i < mainData.length; i++){
            for (int j = 0; j < additionalData.length; j++) {
                if (mainData[i] == additionalData[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                selectedData[indexOfSelectedData] = mainData[i];
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
