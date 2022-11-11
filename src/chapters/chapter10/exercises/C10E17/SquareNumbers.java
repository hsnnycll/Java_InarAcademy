package chapters.chapter10.exercises.C10E17;

import java.math.BigDecimal;

public class SquareNumbers {
    public static void main(String[] args) {

        BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
        System.out.println("The max long value: " + longMaxValue);
        BigDecimal number = new BigDecimal((long)Math.sqrt(Long.MAX_VALUE));

        int count = 0;
        while (count < 10) {
            BigDecimal squared = number.multiply(number);
            if (squared.compareTo(longMaxValue) > 0) {
                System.out.println(count + ": " + number + " squared = " + squared);
                count++;
            }
            number = number.add(BigDecimal.ONE);
        }
    }


}
