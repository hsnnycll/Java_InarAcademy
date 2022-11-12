package chapters.chapter10.exercises.C10E20;

import java.math.BigDecimal;

public class ApproximateE {
    public static void main(String[] args) {
        BigDecimal e = new BigDecimal(1);
        BigDecimal factorial = new BigDecimal(1);

        int item = 100;
        while (item <= 1000) {
            for (int i = 1; i <= item; i++) {
                factorial = factorial.multiply(new BigDecimal(i));
                e = e.add(BigDecimal.ONE.divide(factorial, 25, BigDecimal.ROUND_UP));
            }
            System.out.println("e is " + e + " for i is " + item);
            item += 100;
        }
    }
}
