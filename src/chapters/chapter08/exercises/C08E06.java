package chapters.chapter08.exercises;

import static chapters.chapter08.exercises.C08E05.getMatrix;
import static chapters.chapter08.exercises.C08E05.printMatrix;

public class C08E06 {
    public static void main(String[] args) {

        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        getMatrix(matrix1);
        getMatrix(matrix2);

        printMatrix(matrix1);
        System.out.println(" * ");
        printMatrix(matrix2);
        System.out.println(" = ");

        printMatrix(multiplyMatrix(matrix1, matrix2));
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] multiplyMatrix = new double[3][3];
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                for (int i = 0; i < 3; i++) {
                    multiplyMatrix[row][column] += a[row][i] * b[i][column];
                }
            }
        }
        return multiplyMatrix;
    }
}
