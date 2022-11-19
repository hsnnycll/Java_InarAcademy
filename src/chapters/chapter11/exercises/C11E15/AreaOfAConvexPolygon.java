package chapters.chapter11.exercises.C11E15;

import java.util.ArrayList;
import java.util.Scanner;

public class AreaOfAConvexPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the points:");
        int numberOfPoints = input.nextInt();
        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the cootdinates of points: ");
        for (int i = 0; i < numberOfPoints * 2; i++) {
            points.add(input.nextDouble());
        }
        findTheArea(points);
    }

    public static void findTheArea(ArrayList<Double> list){
        double sumOfMultiply1 = 0;
        list.add(list.get(0));
        list.add(list.get(1));

        for (int i = 0; i < list.size() - 3; i++) {
            sumOfMultiply1 += list.get(i) * list.get(i + 2);
        }

        double sumOfMultiply2 = 0;
        for (int i = 1; i < list.size() - 2; i++) {
            sumOfMultiply1 += list.get(i) * list.get(i + 1);
        }

        double area = (sumOfMultiply1 - sumOfMultiply2) / 2;
        System.out.println("The total area is " + area);
    }
}
