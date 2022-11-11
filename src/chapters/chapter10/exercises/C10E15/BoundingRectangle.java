package chapters.chapter10.exercises.C10E15;

import chapters.chapter10.exercises.C10E13.MyRectangle2D;

import java.util.Scanner;

public class BoundingRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];
        for (int row = 0; row < points.length; row++) {
            points[row][0] = input.nextDouble();
            points[row][1] = input.nextDouble();
        }

        MyRectangle2D rec = getRectangle(points);
        System.out.println("The center point of the rectangle is (" + rec.getX() + ", " + rec.getY() + "), width "
                + rec.getWidth() + ", height " + rec.getHeight());

    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double minX = points[0][0];
        double minY = points[0][1];
        double maxX = points[0][0];
        double maxY = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < minX) {
                minX = points[i][0];
            }
            if (points[i][1] < minY) {
                minY = points[i][1];
            }
            if (points[i][0] > maxX) {
                maxX = points[i][0];
            }
            if (points[i][1] > maxY) {
                maxY = points[i][1];
            }
        }

        double width = maxX - minX;
        double height = maxY - minY;
        double x = maxX - (width / 2);
        double y = maxY - (height / 2);

        return new MyRectangle2D(x, y, width, height);
    }
}
