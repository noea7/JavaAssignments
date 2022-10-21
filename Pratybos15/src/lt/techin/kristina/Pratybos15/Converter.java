package lt.techin.kristina.Pratybos15;

public class Converter {

    public void convertToHex (String data) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            result.append(Integer.toHexString(data.charAt(i)));
        }
        System.out.println(result);
    }
}
