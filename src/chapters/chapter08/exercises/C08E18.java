package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows and columns length: ");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] array = new int[row][column];

        C08E16.getArray(array);
        C08E16.printArray(array);
        shuffleArray(array);
        C08E16.printArray(array);
    }

    public static void shuffleArray(int[][] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * array.length);
            temp = array[i][0];
            array[i][0] = array[random][0];
            array[random][0] = temp;

        }
    }
}
