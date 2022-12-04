package chapters.chapter13.exercises.C13E18;

import java.math.BigDecimal;

public class C13E18 {
    public static void main(String[] args) {

        Rational r = new Rational();
        for (int i = 1; i < 100; i++) {
            if (i == 99) {
                System.out.print(i + "/" + (i + 1));
            } else {
                System.out.print(i + "/" + (i + 1) + " + ");
            }
            r = r.add(new Rational(new BigDecimal(i), new BigDecimal(i + 1)));
        }
        System.out.println("\n= " + r);
    }
}
