package chapters.chapter08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C08E35 {
    public static void main(String[] args) {

        int[][] matrix = getMatrix();

        int[] result = findLargestBlock(matrix);

        if (result[2] > 1) {
            System.out.println("The maximum square sub-matrix is at (" + result[0] + ", " + result[1] + ") with size " + result[2]);
        } else {
            System.out.println("There is no square matrix.");
        }
    }

    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Enter the matrix row by row: ");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                matrix[r][c] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[] findLargestBlock(int[][] matrix) {
        int[] result = new int[3];
        int max = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (isSquareMatrix(matrix, i, j, max)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = max;
                    max++;
                }
            }
        }
        return result;
    }

    public static boolean isSquareMatrix(int[][] matrix, int row, int column, int count) {
        if (column + count > matrix.length) {
            return false;
        }
        if (row + count > matrix.length) {
            return false;
        }
        for (int i = row; i < row + count; i++) {
            for (int j = column; j < column + count; j++) {
                if (matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
