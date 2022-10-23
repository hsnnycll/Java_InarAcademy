package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a00, a01, a10, a11, b0, b1: ");
        double[][] points = new double[2][2];
        for (int r = 0; r < points.length; r++) {
            for (int c = 0; c < points.length; c++) {
                points[r][c] = input.nextDouble();
            }
        }
        double[] pointsb = new double[2];
        pointsb[0] = input.nextDouble();
        pointsb[1] = input.nextDouble();

        double[] result = linearEquation(points, pointsb);
        if (result == null) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("The value of x is " + result[0]);
            System.out.println("The value of y is " + result[1]);
        }
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];
        result[0] = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        result[1] = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        if ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0) {
            return null;
        }
        return result;
    }
}
