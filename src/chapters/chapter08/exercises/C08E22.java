package chapters.chapter08.exercises;

import java.util.Arrays;

public class C08E22 {
    public static void main(String[] args) {

        int[][] array = new int[6][6];

        fillArray(array);
        displayArray(array);

        System.out.println(checkArray(array) ? "Every row and column has even 1's" : "Every row and column has not even 1's");

    }

    public static void fillArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = generateRandomNumber();
            }
        }
    }

    public static int generateRandomNumber() {
        int number = (int) (Math.random() * 2);
        return number;
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static boolean checkArray(int[][] array) {
        return (checkRow(array) && checkCol(array));
    }

    public static boolean checkRow(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            int count = 0;
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol(int[][] array) {
        for (int col = 0; col < array.length; col++) {
            int count = 0;
            for (int row = 0; row < array[col].length; row++) {
                if (array[row][col] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
