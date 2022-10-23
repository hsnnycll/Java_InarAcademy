package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the points: ");
        double[][] points = new double[4][2];
        for (int r = 0; r < points.length; r++) {
            for (int c = 0; c < points[r].length; c++) {
                points[r][c] = input.nextDouble();
            }
        }
        double[] point = getIntersectionPoint(points);
        if (point == null)
            System.out.println("Two lines are parallel.");
        else
            System.out.printf("The intersection point is: %.2f %.2f", point[0], point[1]);
    }

    public static double[] getIntersectionPoint(double[][] points) {
        double md1 = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        double md2 = (points[3][1] - points[2][1]) / (points[3][0] - points[2][0]);
        double intersectionX = ((md1 * points[0][0]) - (md2 * points[2][0]) + points[2][1] - points[0][1]) / (md1 - md2);
        double intersectionY = (md1 * (intersectionX - points[0][0]) + points[0][1] + md2 * (intersectionX - points[2][0]) + points[2][1]) / 2;
        double[] point = new double[2];
        point[0] = intersectionX;
        point[1] = intersectionY;
        if (md1 == md2) {
            return null;
        }
        return point;
    }
}
