package chapters.chapter10.exercises.C10E21;

import java.math.BigInteger;

public class Divisible5Or6 {
    public static void main(String[] args) {

        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);

        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        int count = 0;
        while(count < 10){
            if(number.remainder(five).equals(zero) || number.remainder(six).equals(zero)){
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
