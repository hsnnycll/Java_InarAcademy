package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int[][] matrix = new int[6][6];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }
        int row = checkRow(matrix);
        int col = checkCol(matrix);
        System.out.println("The flipped cell is at (" + row + ", " + col + ")");

    }

    public static int checkRow(int[][] matrix) {
        int sum = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sum += matrix[r][c];
            }
            if (sum % 2 != 0) {
                return r;
            }
        }
        return -1;
    }

    public static int checkCol(int[][] matrix) {
        int sum = 0;
        for (int c = 0; c < matrix[0].length; c++) {
            for (int r = 0; r < matrix.length; r++) {
                sum += matrix[r][c];
            }
            if (sum % 2 != 0) {
                return c;
            }
        }
        return -1;
    }
}
