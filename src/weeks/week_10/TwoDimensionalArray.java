package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int numRow = input.nextInt();
        int numCol = input.nextInt();
        int[][] array = new int[numRow][numCol];
        fill2DArrWithRandomValues(array);
        printArray(array);
        indexOfMaxRow(array);
        indexOfMaxCol(array);

    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void fill2DArrWithRandomValues(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void indexOfMaxRow(int[][] array) {
        int maxValueOfRow = -1;
        int indexOfMaxValueOfRow = Integer.MIN_VALUE;
        for (int row = 0; row < array.length; row++) {
            int sum = 0;
            for (int column = 0; column < array[row].length; column++) {
                sum += array[row][column];
            }
            if (sum > maxValueOfRow) {
                maxValueOfRow = sum;
                indexOfMaxValueOfRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxValueOfRow + " has the maximum value and sum is " + maxValueOfRow);
    }

    public static void indexOfMaxCol(int[][] array) {
        int maxValueOfCol = -1;
        int indexOfMaxValueOfCol = Integer.MIN_VALUE;
        for (int col = 0; col < array.length; col++) {
            int sum = 0;
            for (int row = 0; row < array[col].length; row++) {
                sum += array[row][col];
            }
            if (sum > maxValueOfCol) {
                maxValueOfCol = sum;
                indexOfMaxValueOfCol = col;
            }
        }
        System.out.println("Column " + indexOfMaxValueOfCol + " has the maximum value and sum is " + maxValueOfCol);
    }
}
