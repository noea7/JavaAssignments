package lt.techin.kristina.Pratybos13;

public class Pratybos13_2 {
    public static void main(String[] args) {
        double[] dataJanuary = {-11.5, -10.3, -12, -6.5, -5, -15.5};
        double[] dataFebruary = {-16, -14.5, -11, -10.3, -3.5, 0};
        double[] dataMarch = {-3, -2.5, 0, 5, 9.5, 11.2};
        System.out.printf("Vidutinė sausio temperatūra: %.2f \n", averageData(dataJanuary));
        System.out.printf("Vidutinė vasario temperatūra: %.2f \n", averageData(dataFebruary));
        System.out.printf("Vidutinė kovo temperatūra: %.2f \n", averageData(dataMarch));
//        System.out.printf("Bendras atliktų matavimų vidurkis: %.2f \n", averageData(compoundData(dataJanuary, dataFebruary, dataMarch)));
        System.out.printf("Bendras atliktų matavimų vidurkis: %.2f \n", averageData(dataJanuary,dataFebruary,dataMarch));
    }

//    private static double[] compoundData(double[] data1, double[] data2, double[] data3) {
//        double[] compoundData = new double[data1.length + data2.length + data3.length];
//        int index = 0;
//        for (int i = 0; i < data1.length; i++) {
//            compoundData[index] = data1[i];
//            index++;
//        }
//        for (int i = 0; i < data2.length; i++) {
//            compoundData[index] = data2[i];
//            index++;
//        }
//        for (int i = 0; i < data3.length; i++) {
//            compoundData[index] = data3[i];
//            index++;
//        }
//        return compoundData;
//    }


    private static double averageData(double ... data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum/data.length;
    }

    private static double averageData(double[] ... data) {
        double sum = 0;
        double length = 0;
        for (double[] dataSet : data) {
            for (int i = 0; i < dataSet.length; i++) {
                sum += dataSet[i];
            }
            length+= dataSet.length;
        }
        return sum/length;
    }
}
