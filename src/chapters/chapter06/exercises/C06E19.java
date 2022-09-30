package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (MyTriangle.isValid(side1, side2, side3)) {
            System.out.printf("The area of the triangle: %.2f", MyTriangle.area(side1, side2, side3));
        } else
            System.out.println("The input is invalid.");
    }

    class MyTriangle {
        public static boolean isValid(double side1, double side2, double side3) {
            if ((side1 + side2) < side3) {
                return false;
            } else if ((side1 + side3) < side2) {
                return false;
            } else if ((side2 + side3) < side1) {
                return false;
            } else
                return true;
        }

        public static double area(double side1, double side2, double side3) {
            double s = (side1 + side2 + side3) / 2;
            return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        }
    }
}