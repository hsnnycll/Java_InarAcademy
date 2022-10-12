package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C07E25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a b and c: ");
        double[] eqn = new double[3];
        double[] roots = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        int numberOfroots = solveQuadratic(eqn, roots);
        System.out.println("The number of roots " + numberOfroots);

        if (numberOfroots != 0)
            System.out.println("The real roots are " + Arrays.toString(roots));
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            roots[0] = ((-b + Math.pow(discriminant, 0.5)) / (2 * a));
            roots[1] = ((-b - Math.pow(discriminant, 0.5)) / (2 * a));
            return 2;
        } else if (discriminant == 0) {
            roots[0] = ((-b + Math.pow(discriminant, 0.5)) / (2 * a));
            return 1;
        } else
            return 0;
    }
}
