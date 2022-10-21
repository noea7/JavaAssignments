package lt.techin.kristina.Pratybos15;

public class PrimeNumbers {

    public void countPrimeNumbers(int start, int end) {
        StringBuilder result = new StringBuilder();
        boolean isPrime = true;
        for (int i = start; i <=end; i++) {
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result.append(i);
                result.append(", ");
            }
            isPrime = true;
        }
        System.out.println(result);
    }
}
