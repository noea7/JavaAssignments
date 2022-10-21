package lt.techin.kristina.Pratybos15;

import java.util.Random;

public class Generator {

    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            result[i] = random.nextInt(300) - 150; //generate both positive and negative values
        }
        return result;
    }
}
