package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = new int[3][3];
        getArray(array);

        int[][] array2 = new int[3][3];
        getArray(array2);

        printArray(array);
        printArray(array2);

        System.out.println("The two arrays are " + ((equals(array, array2)) ? " strictly identical." : " not strictly identical."));

    }

    public static void getArray(int[][] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3x3 array: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

    public static boolean equals(int[][] array, int[][] array2) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] != array2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
