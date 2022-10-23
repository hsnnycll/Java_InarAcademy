package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three points: ");
        double[][] points = new double[3][2];
        for (int r = 0; r < points.length; r++) {
            for (int c = 0; c < points[r].length; c++) {
                points[r][c] = input.nextDouble();
            }
        }

        double area = getTriangleArea(points);
        if (area == 0) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.printf("The area of the triangle is %.2f", area);
        }
    }

    public static double getTriangleArea(double[][] points) {
        double side1 = Math.pow((Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2)), 0.5);
        double side2 = Math.pow((Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2)), 0.5);
        double side3 = Math.pow((Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2)), 0.5);

        double s = (side1 + side2 + side3) / 2;
        double area = s * (s - side1) * (s - side2) * (s - side3);
        if (area < 0.1) {
            return 0;
        }
        return Math.sqrt(area);
    }
}
