package chapters.chapter10.exercises.C10E18;

import java.math.BigInteger;

public class LargePrimeNumbers {
    public static void main(String[] args) {

        BigInteger ZERO = new BigInteger("0");
        BigInteger bigPrime = new BigInteger(String.valueOf(Long.MAX_VALUE));

        boolean isPrime = true;
        int count = 0;

        long sqrt = (long) (Math.sqrt(Long.MAX_VALUE));

        while (count < 5){
            BigInteger divisor = new BigInteger("2");
            bigPrime = bigPrime.add(BigInteger.ONE);

            for (long i = 2; i <= sqrt + 1; i++) {
                if (bigPrime.remainder(divisor).equals(ZERO)){
                    isPrime = false;
                    break;
                }
                divisor = divisor.add(BigInteger.ONE);
            }
            if (isPrime) {
                System.out.println(bigPrime);
                count++;
            }
            sqrt++;
        }
    }
}
