package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C07E05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] distinctNumbers = new int[10];

        int count = 0;
        for (int i = 0; i < distinctNumbers.length; i++) {
            int num = input.nextInt();
            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }
        System.out.println("The number of distinct number is " + count);
        System.out.println("The distinct numbers are: ");
        for (int j = 0; j < distinctNumbers.length; j++) {
            if (distinctNumbers[j] > 0)
                System.out.print(distinctNumbers[j] + " ");
        }
    }

    public static boolean isDistinct(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return false;
        }
        return true;
    }
}
