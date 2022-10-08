package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);
    }
    public static void reverse(int[] array){
        int[] reversedNumbers = new int[10];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedNumbers[i] = array[j];
            System.out.print(reversedNumbers[i] + " ");
        }
    }
}
