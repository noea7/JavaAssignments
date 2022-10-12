package lt.techin.kristina.Pratybos12;

import java.math.BigInteger;
import java.util.Arrays;

public class Pratybos12_6 {
    public static void main(String[] args) {
        BigInteger[] fibSequence = new BigInteger[120];
        fibSequence[0] = BigInteger.valueOf(1);
        fibSequence[1] = BigInteger.valueOf(1);

        for (int i = 2; i < 120; i++) {
            fibSequence[i] = fibSequence[i-1].add(fibSequence[i-2]);
        }
        System.out.println(Arrays.toString(fibSequence));
        System.out.println("120th Fibonacci number: " + fibSequence[119]);
    }


}
