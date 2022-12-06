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
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                while (isSquareMatrix(matrix, row, col, max)) {
                    result[0] = row;
                    result[1] = col;
                    result[2] = max;
                    max++;
                }
            }
        }
        return result;
    }

    public static boolean isSquareMatrix(int[][] matrix, int row, int col, int max) {
        if (col + max > matrix.length) {
            return false;
        }
        if (row + max > matrix.length) {
            return false;
        }
        for (int i = row; i < row + max; i++) {
            for (int j = col; j < col + max; j++) {
                if (matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    /*public static int[] findLargestBlock(int[][] m){
        int[] result = new int[3];
        for (int k = 1; k < m.length - 1; k++) {
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    int count = 0;
                    if(m[i][j] == 1){
                        for (int a = i; a < m.length - k; a++) {
                            for (int b = j; b < m.length - k; b++) {
                                if (m[a][b] == 1){
                                    count++;
                                } else if (m[a][b] == 0) {
                                    a = m.length - k + 1;
                                    b = m.length - k + 1;
                                }
                            }
                        }
                        if (count == Math.pow((m.length - k + 1), 2)){
                            result[0] = i;
                            result[1] = j;
                            result[2] = m.length - k + 1;
                            return result;
                        }
                    }
                }
            }
        }
        return null;
    }*/
}
