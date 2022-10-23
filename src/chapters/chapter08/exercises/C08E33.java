package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter four points: ");
        double[][] points = new double[4][2];
        for (int r = 0; r < points.length; r++) {
            for (int c = 0; c < points[r].length; c++) {
                points[r][c] = input.nextDouble();
            }
        }
        theAreaOfTriangles(points);
    }

    public static void theAreaOfTriangles(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];

        double[] intersection = findIntersectionPoint(x1, y1, x3, y3, x2, y2, x4, y4);
        double xI = intersection[0];
        double yI = intersection[1];

        double[] areas = new double[4];
        areas[0] = areaOfTriangle(x1, y1, x2, y2, xI, yI);
        areas[1] = areaOfTriangle(x2, y2, x3, y3, xI, yI);
        areas[2] = areaOfTriangle(x3, y3, x4, y4, xI, yI);
        areas[3] = areaOfTriangle(x1, y1, x4, y4, xI, yI);

        sort(areas);
        System.out.print("The areas are ");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%.2f ",areas[i]);
        }
    }

    public static double areaOfTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
        double side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)), 0.5);
        double side3 = Math.pow((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)), 0.5);

        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public static double[] sort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static double[] findIntersectionPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        double md1 = (y2 - y1) / (x2 - x1);
        double md2 = (y4 - y3) / (x4 - x3);
        double intersectionX = ((md1 * x1) - (md2 * x3) + y3 - y1) / (md1 - md2);
        double intersectionY = (md1 * (intersectionX - x1) + y1 + md2 *(intersectionX -x3) + y3) / 2;

        double[] point = new double[2];
        point[0] = intersectionX;
        point[1] = intersectionY;

        return point;
    }
}
