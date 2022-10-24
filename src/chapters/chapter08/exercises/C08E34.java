package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 6 points: ");
        double[][] points = new double[6][2];
        for (int r = 0; r < points.length; r++) {
            for (int c = 0; c < points[r].length; c++) {
                points[r][c] = input.nextDouble();
            }
        }
        double[] point = findTheRightmostLowestPoint(points);
        System.out.printf("The rightmost lowest point is (%.1f, %.1f)", point[0], point[1]);
    }

    public static double[] findTheRightmostLowestPoint(double[][] points) {
        double[] point = new double[2];
        point[0] = points[0][0];
        point[1] = points[0][1];
        for (int row = 1; row < points.length; row++) {
            if (point[1] > points[row][1]) {
                point[0] = points[row][0];
                point[1] = points[row][1];
            } else if (point[1] == points[row][1]) {
                if (points[row][0] > point[0]) {
                    point[0] = points[row][0];
                    point[1] = points[row][1];
                }
            }
        }
        return point;
    }
}
