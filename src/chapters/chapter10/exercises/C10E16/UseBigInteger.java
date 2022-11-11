package chapters.chapter10.exercises.C10E16;

import java.math.BigInteger;

public class UseBigInteger {
    public static void main(String[] args) {

        String str = "1";
        for (int i = 0; i < 49; i++) {
            str += "0";
        }

        BigInteger number = new BigInteger(str);
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
        BigInteger zero = new BigInteger("0");

        int count = 0;
        while(count < 10){
            if(number.remainder(two).equals(zero) || number.remainder(three).equals(zero)){
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
