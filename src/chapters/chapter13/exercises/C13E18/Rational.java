package chapters.chapter13.exercises.C13E18;

import java.math.BigDecimal;

public class Rational extends Number implements Comparable<Rational> {

    private BigDecimal numerator;
    private BigDecimal denominator;

    public Rational() {
        this(BigDecimal.ZERO, BigDecimal.ONE);
    }

    public Rational(BigDecimal numerator, BigDecimal denominator) {
        BigDecimal gcd = BigDecimal.valueOf(gcd(numerator, denominator));
        this.numerator = ((denominator.compareTo(BigDecimal.ZERO) > 0)
                ? BigDecimal.ONE : new BigDecimal(-1)).multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    private static int gcd(BigDecimal n, BigDecimal d) {
        BigDecimal n1 = n.abs();
        BigDecimal n2 = d.abs();
        int gcd = 1;

        for (int k = 1; n1.compareTo(BigDecimal.valueOf(k)) > 0 && n2.compareTo(BigDecimal.valueOf(k)) > 0 && n2.compareTo(BigDecimal.valueOf(k)) == 0; k++) {
            if (n1.remainder(BigDecimal.valueOf(k)).equals(0) && n2.remainder(BigDecimal.valueOf(k)).equals(0)) {
                gcd = k;
            }
        }
        return gcd;
    }

    public BigDecimal getNumerator() {
        return numerator;
    }

    public BigDecimal getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        BigDecimal n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
        BigDecimal d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        BigDecimal n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigDecimal d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        BigDecimal n = numerator.multiply(secondRational.getNumerator());
        BigDecimal d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        BigDecimal n = numerator.multiply(secondRational.getDenominator());
        BigDecimal d = denominator.multiply(secondRational.numerator);
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(1)) {
            return numerator + "";
        } else {
            return numerator + "/" + denominator;
        }
    }

    @Override
    public boolean equals(Object other) {
        if ((this.subtract((Rational) (other))).getNumerator().equals(0)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.divide(denominator).doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().compareTo(BigDecimal.ZERO) > 0) {
            return 1;
        } else if (this.subtract(o).getNumerator().compareTo(BigDecimal.ZERO) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
