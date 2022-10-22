package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int rowSize = input.nextInt();

        double[][] cities = new double[rowSize][2];
        System.out.println("Enter the coordinates of the cities: ");

        for (int row = 0; row < cities.length; row++) {
            for (int col = 0; col < cities[row].length; col++) {
                cities[row][col] = input.nextDouble();
            }
        }
        centralCity(cities);
    }

    public static void centralCity(double[][] cities) {
        double[] distance = new double[cities.length];
        for (int i = 0; i < cities.length; i++) {
            double dist = 0;
            for (int j = 0; j < cities.length; j++) {
                dist += Math.sqrt(Math.pow((cities[i][0] - cities[j][0]), 2) + Math.pow((cities[i][1] - cities[j][1]), 2));
            }
            distance[i] = dist;
        }
        int index = 0;
        double minDist = distance[0];
        for (int i = 1; i < distance.length; i++) {
            if (minDist > distance[i]) {
                minDist = distance[i];
                index = i;
            }
        }
        System.out.println("The central city is at (" + cities[index][0] + ", " + cities[index][1] + ")");
        System.out.printf("The total distance to all other cities is %.2f", minDist);

    }
}
