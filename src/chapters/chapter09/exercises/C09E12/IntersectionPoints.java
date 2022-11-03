package chapters.chapter09.exercises.C09E12;

import chapters.chapter09.exercises.C09E11.LinearEquation;

import java.util.Scanner;

public class IntersectionPoints {
    /*
    ax + by = e
    cx + dy = f

    x =(ed - bf) / (ad - bc)
    y =(af - ec) / (ad - bc)

       a            b           a               b
    (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1

        c           d           c               d
    (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
     */

    public static void main(String[] args) {

        double[][] points = getPoints();

        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = (a * points[0][0]) + (b * points[0][1]);
        double f = (c * points[2][0]) + (d * points[2][1]);

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        displayTheIntersectionPoints(equation);

    }

    public static void displayTheIntersectionPoints(LinearEquation equation) {
        if (equation.isSolvable()) {
            System.out.printf("The intersecting point is at (%.5f, %.5f)", equation.getX(), equation.getY());

        } else
            System.out.println("The equation has no roots! Two lines are parallel");

    }

    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[4][2];

        System.out.println("Enter the points: ");

        for (int p = 0; p < points.length; p++) {
            points[p][0] = input.nextDouble();
            points[p][1] = input.nextDouble();
        }
        return points;
    }
}

