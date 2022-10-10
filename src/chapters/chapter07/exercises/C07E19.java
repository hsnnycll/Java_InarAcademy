package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the list (first number will be the number of the list): ");
        int length = input.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)) {
            System.out.println("The list is already sorted.");
        } else
            System.out.println("The list is not sorted.");

    }

    public static boolean isSorted(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (!(min <= list[i])) {
                return false;
            } else
                min = list[i];
        }
        return true;
    }
}
