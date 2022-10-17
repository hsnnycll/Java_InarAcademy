package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E05 {
    public static void main(String[] args) {

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        getMatrix(matrix1);
        getMatrix(matrix2);

        printMatrix(matrix1);
        System.out.println(" + ");
        printMatrix(matrix2);
        System.out.println(" = ");

        printMatrix(theSumMatrix(matrix1, matrix2));
    }

    public static void getMatrix(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 X 3 matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] theSumMatrix(double[][] matrix1, double[][] matrix2) {
        double[][] sumMatrix = new double[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                sumMatrix[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return sumMatrix;
    }
}
