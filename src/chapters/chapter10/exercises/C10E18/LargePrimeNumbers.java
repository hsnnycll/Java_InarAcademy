package chapters.chapter10.exercises.C10E18;

import java.math.BigInteger;

public class LargePrimeNumbers {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);
        BigInteger divisor = new BigInteger(String.valueOf(BigInteger.TWO));

        int count = 0;
        while (count < 5) {
            while ((divisor.compareTo(number.divide(BigInteger.TWO)) <= 0)) {
                if (!(number.remainder(divisor).equals(BigInteger.ZERO))) {
                    System.out.println(number);
                    number = number.add(BigInteger.ONE);
                    divisor = BigInteger.TWO;
                    count++;
                }
                divisor.add(BigInteger.ONE);
            }
        }
    }
}
