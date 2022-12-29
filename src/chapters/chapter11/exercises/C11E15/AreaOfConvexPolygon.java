package chapters.chapter11.exercises.C11E15;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfConvexPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the points:");
        int n = input.nextInt();
        ArrayList<Double> x = new ArrayList<>();
        ArrayList<Double> y = new ArrayList<>();
        System.out.println("Enter the coordinates of points: ");

        for (int i = 0; i < n; i++) {
            x.add(input.nextDouble());
            y.add(input.nextDouble());
        }
        double areaOfPolygon = findPolygonArea(x, y);
        System.out.println("The total area is " + areaOfPolygon);
    }

    public static double findPolygonArea(ArrayList<Double> x, ArrayList<Double> y){
        ArrayList<Double> trianglePointsX = new ArrayList<>();
        ArrayList<Double> trianglePointsY = new ArrayList<>();
        double areaOfPolygon = 0;

        for (int i = 1; i < x.size() - 1; i++) {
            trianglePointsX.add(x.get(0));
            trianglePointsY.add(y.get(0));
            trianglePointsX.add(x.get(i));
            trianglePointsY.add(y.get(i));
            trianglePointsX.add(x.get(i + 1));
            trianglePointsY.add(y.get(i + 1));
            areaOfPolygon += findTriangleArea(trianglePointsX, trianglePointsY);
            trianglePointsX.clear();
            trianglePointsY.clear();
        }
        return areaOfPolygon;
    }

    public static double findTriangleArea(ArrayList<Double> x, ArrayList<Double> y){
        double s1 = findSide(x.get(0), y.get(0), x.get(1), y.get(1));
        double s2 = findSide(x.get(1), y.get(1), x.get(2), y.get(2));
        double s3 = findSide(x.get(2), y.get(2), x.get(0), y.get(0));
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt((s - s1) * (s - s2) * (s - s3) * s);
    }

    public static double findSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 - y1));
    }
}
