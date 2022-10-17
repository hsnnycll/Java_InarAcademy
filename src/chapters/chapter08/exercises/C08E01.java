package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] numbers = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 4; column++) {
                numbers[row][column] = input.nextDouble();
            }
        }

        for (int column = 0; column < numbers[0].length; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(numbers, column));
        }
    }

    public static double sumColumn(double[][] numbers, int columnIndex) {
        double total = 0;
        for (int row = 0; row < numbers.length; row++) {
            total += numbers[row][columnIndex];
        }
        return total;
    }
}
