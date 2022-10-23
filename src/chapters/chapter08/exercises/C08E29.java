package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E29 {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        getArray(array);

        int[][] array2 = new int[3][3];
        getArray(array2);

        System.out.println("The two arrays are" + ((equals(array, array2)) ? " identical." : " not identical."));
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

    public static boolean equals(int[][] m1, int[][] m2) {
        sortArray(m1);
        sortArray(m2);

        printArray(m1);
        printArray(m2);
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                if (m1[row][col] != m2[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void sortArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix.length; l++) {
                        if(matrix[i][j] < matrix[k][l]){
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
    }
}
