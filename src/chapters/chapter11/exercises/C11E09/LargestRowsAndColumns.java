package chapters.chapter11.exercises.C11E09;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size n: ");
        int size = input.nextInt();
        int[][] matrix = getMatrix(size);

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        sumRows(rows, matrix);
        sumCols(cols, matrix);

        printMatrix(matrix);

        int maxValueOfRow = findMaxSumRow(rows);
        int maxValueOfCol = findMaxSumCol(cols);

        printIndexOfMaxRow(rows, maxValueOfRow);
        printIndexOfMaxCol(cols, maxValueOfCol);
    }

    public static int[][] getMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void sumRows(ArrayList<Integer> rows, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int col = 0; col < matrix.length; col++) {
                sum += matrix[row][col];
            }
            rows.add(row, sum);
        }
    }

    public static void sumCols(ArrayList<Integer> cols, int[][] matrix) {
        for (int col = 0; col < matrix.length; col++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            cols.add(col, sum);
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static int findMaxSumRow(ArrayList<Integer> rows) {
        int max = rows.get(0);
        for (int i = 1; i < rows.size(); i++) {
            max = Math.max(rows.get(i), max);
        }
        return max;
    }

    public static int findMaxSumCol(ArrayList<Integer> cols) {
        int max = cols.get(0);
        for (int i = 1; i < cols.size(); i++) {
            max = Math.max(cols.get(i), max);
        }
        return max;
    }

    public static void printIndexOfMaxRow(ArrayList<Integer> list, int max) {
        System.out.print("\nThe largest row index: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(max)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void printIndexOfMaxCol(ArrayList<Integer> list, int max) {
        System.out.print("\nThe largest column index: ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(max)) {
                System.out.print(i + ", ");
            }
        }
    }
}
