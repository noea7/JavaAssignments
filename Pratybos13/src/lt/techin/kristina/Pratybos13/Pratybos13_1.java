package lt.techin.kristina.Pratybos13;

public class Pratybos13_1 {
    public static void main(String[] args) {
        String text = "Java for all";
        System.out.println(reverseString(text));
    }

    private static String reverseString(String text) {
        String textWithoutSpaces = text.replaceAll(" ", "");
        StringBuilder result = new StringBuilder();
        for (int i = textWithoutSpaces.length() - 1; i >= 0; i--){
            result.append(textWithoutSpaces.charAt(i));
        }
        return String.valueOf(result);
    }
}
