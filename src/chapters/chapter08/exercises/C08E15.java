package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        if (sameLine(points)) {
            System.out.println("The five points are on the same line");
        } else {
            System.out.println("The five points are not on the same line");
        }
    }

    public static boolean sameLine(double[][] points) {
        double x0 = points[0][0];
        double y0 = points[0][1];
        double x1 = points[1][0];
        double y1 = points[1][0];
        for (int i = 2; i < points.length; i++) {
            double det = (x1 - x0) * (points[i][1] - y0) - (points[i][0] - x0) * (y1 - y0);
            if (det != 0) {
                return false;
            }
        }
        return true;
    }
}
