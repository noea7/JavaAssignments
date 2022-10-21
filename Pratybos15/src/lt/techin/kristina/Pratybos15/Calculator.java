package lt.techin.kristina.Pratybos15;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    public double calculate() {
        System.out.println("Enter a first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Choose an operation: 1 for +; 2 for -; 3 for *; 4 for /; 5 for sin; " +
                "6 for cos; 7 for tan; 8 for sqrt; 9 for %; 10 for pow");
        int operationNumber = scanner.nextInt();
        scanner.nextLine();
        if (operationNumber >=5 && operationNumber <= 8) {
            scanner.close();
            return calculate(number1,operationNumber);
        } else {
            System.out.println("Enter a second number: ");
            double number2 = scanner.nextDouble();
            scanner.nextLine();
            scanner.close();
            return calculate(number1,number2,operationNumber);
        }
    }
    public double calculate(double number1, double number2, int operationNumber) {
        double result = -1;
        switch (operationNumber) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                }
                break;
            case 9:
                result = number1 * number2 / 100;
                break;
            case 10:
                result = Math.pow(number1,number2);
        }
        return result;
    }
    public double calculate(double number1, int operationNumber) {
        double result = -1;
        switch (operationNumber) {
            case 5:
                result = Math.sin(number1);
                break;
            case 6:
                result = Math.cos(number1);
                break;
            case 7:
                result = Math.tan(number1);
                break;
            case 8:
                result = Math.sqrt(number1);
                break;
        }
        return result;
    }
}
