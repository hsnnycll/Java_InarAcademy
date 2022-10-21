package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows and columns length: ");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] array = new int[row][column];

        getArray(array);
        printArray(array);
        sortArray(array);
        printArray(array);
    }

    public static void getArray(int[][] array) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array: ");
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

    public static void sortArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int min0 = array[i][0];
            int min1 = array[i][1];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if ((array[j][0] < min0) || (array[j][1] < min1 && array[j][0] == min0)) {
                    min0 = array[j][0];
                    min1 = array[j][1];
                    index = j;
                }
            }
            if (index != i) {
                array[index][0] = array[i][0];
                array[index][1] = array[i][1];
                array[i][0] = min0;
                array[i][1] = min1;
            }
        }
    }
}
