package lt.techin.kristina.Pratybos12;

public class Pratybos12_2 {
    public static void main(String[] args) {
        int[] grades = {1, 5, 8, 7, 10, 9, 9, 8, 7, 7, 4, 6, 8};
        int numberOfGrades = grades.length;
        int numberOf1s = 0;
        int numberOf2s = 0;
        int numberOf3s = 0;
        int numberOf4s = 0;
        int numberOf5s = 0;
        int numberOf6s = 0;
        int numberOf7s = 0;
        int numberOf8s = 0;
        int numberOf9s = 0;
        int numberOf10s = 0;
        for (int i=0; i<grades.length; i++) {
            switch (grades[i]) {
                case 1:
                    numberOf1s++;
                    break;
                case 2:
                    numberOf2s++;
                    break;
                case 3:
                    numberOf3s++;
                    break;
                case 4:
                    numberOf4s++;
                    break;
                case 5:
                    numberOf5s++;
                    break;
                case 6:
                    numberOf6s++;
                    break;
                case 7:
                    numberOf7s++;
                    break;
                case 8:
                    numberOf8s++;
                    break;
                case 9:
                    numberOf9s++;
                    break;
                case 10:
                    numberOf10s++;
                    break;
            }
        }
        System.out.printf("1 - %.2f",((double)numberOf1s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("2 - %.2f",((double)numberOf2s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("3 - %.2f",((double)numberOf3s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("4 - %.2f",((double)numberOf4s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("5 - %.2f",((double)numberOf5s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("6 - %.2f",((double)numberOf6s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("7 - %.2f",((double)numberOf7s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("8 - %.2f",((double)numberOf8s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("9 - %.2f",((double)numberOf9s/numberOfGrades*100));
        System.out.print("%, " );
        System.out.printf("10 - %.2f",((double)numberOf10s/numberOfGrades*100));
        System.out.print("%, " );
    }
}
