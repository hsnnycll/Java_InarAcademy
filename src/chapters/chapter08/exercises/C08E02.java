package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int row = 0; row < 4; row++) {
            for (int column = 0; column < 4; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));
    }

    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int row = 0, column = 0; row < m.length; row++, column++) {
                 sum += m[row][column];
        }
        return sum;
    }
}
