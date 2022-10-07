package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the ten integers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("The reversed of the numbers: ");
        int[] reversedNumbers = reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(reversedNumbers[i] + " ");
        }
    }

    public static int[] reverse(int[] numbers) {
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            reversedNumbers[j] = numbers[i];
        }
        return reversedNumbers;
    }
}
