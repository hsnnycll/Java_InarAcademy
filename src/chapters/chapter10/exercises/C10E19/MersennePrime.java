package chapters.chapter10.exercises.C10E19;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {

        System.out.println("p\t\t\t2^p - 1");
        int p = 2;
        BigInteger d = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
        System.out.println(p + "\t\t\t" + d);
        while (p <= 100) {
            d = BigInteger.TWO.pow(p).subtract(BigInteger.ONE);
            if (isPrime(p) && isPrime(d)) {
                System.out.println(p + "\t\t\t" + d);
            }
            p++;
        }
    }

    public static boolean isPrime(int num){
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(BigInteger num){
        BigInteger divisor = BigInteger.TWO;
        while ((divisor.compareTo(num.divide(BigInteger.TWO)) <= 0)) {
            if ((num.remainder(divisor).equals(BigInteger.ZERO))) {
               return false;
            }
            divisor.add(BigInteger.ONE);
        }
        return true;
    }
}
