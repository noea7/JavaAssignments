package lt.techin.kristina.pratybos18.p18_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColorGenerator {

    public static String generateColor() {
        StringBuilder resultColor = new StringBuilder("#");
        for (int i = 0; i < 6; i++) {
            resultColor.append(generateSymbol());
        }
        return resultColor.toString();
    }
    public static List<String> generateListOfColors(int numberOfColors) {
        List<String> resultColors = new ArrayList<>();
        for (int i = 0; i<numberOfColors; i++) {
            resultColors.add(generateColor());
        }
        return resultColors;
    }

    private static String generateSymbol() {
        Random rnd = new Random();
        int index = rnd.nextInt(17);
        switch (index) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                return Integer.toString(index);
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
        }
        return "0";
    }
}
