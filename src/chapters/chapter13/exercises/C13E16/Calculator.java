package chapters.chapter13.exercises.C13E16;

public class Calculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        if (args[0].contains("/") || args[2].contains("/")) {
            Rational r1;
            if (args[0].contains("/")) {
                String[] operand1 = args[0].split("/");
                long numerator1 = Long.parseLong(operand1[0]);
                long denominator1 = Long.parseLong(operand1[1]);
                r1 = new Rational(numerator1, denominator1);
            } else {
                r1 = new Rational(Long.parseLong(args[0]), 1);
            }
            Rational r2;
            if (args[2].contains("/")) {
                String[] operand2 = args[2].split("/");
                long numerator2 = Long.parseLong(operand2[0]);
                long denominator2 = Long.parseLong(operand2[1]);
                r2 = new Rational(numerator2, denominator2);
            } else {
                r2 = new Rational(Long.parseLong(args[2]), 1);
            }
            Rational result = new Rational();
            switch (args[1].charAt(0)) {
                case '+':
                    result = r1.add(r2);
                    break;
                case '-':
                    result = r1.subtract(r2);
                    break;
                case '.':
                    result = r1.multiply(r2);
                    break;
                case '/':
                    result = r1.divide(r2);
            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        } else {
            int result = 0;
            switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;
                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '.':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;
                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            }
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
        }
    }
}
