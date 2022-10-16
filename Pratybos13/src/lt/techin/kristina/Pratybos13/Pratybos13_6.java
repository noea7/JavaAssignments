package lt.techin.kristina.Pratybos13;

import java.text.DecimalFormat;

public class Pratybos13_6 {

    private static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {
        double[] incomeData = {824.25, 1225.12, 459.16, 1500};
        System.out.print("Atlyginimas iki: ");
        for (double element : incomeData) {
            System.out.print(df.format(element) + " ");
        }
        System.out.println();
        System.out.print("Atlyginimas po: ");
        double[] increasedIncomeData = increaseIncome(incomeData);
        for (double element : increasedIncomeData) {
            System.out.print(df.format(element) + " ");
        }

    }

    private static double[] increaseIncome(double[] incomeData) {
        double[] increasedIncomeData = new double[incomeData.length];
        for (int i = 0; i < incomeData.length; i++) {
            if (incomeData[i] >1000) {
                increasedIncomeData[i] = incomeData[i] * 1.05;
            } else {
                increasedIncomeData[i] = incomeData[i] * 1.1;
//                increasedIncomeData[i] = Double.valueOf(df.format(increasedIncomeData[i]));
            }
        }
        return increasedIncomeData;
    }

}
