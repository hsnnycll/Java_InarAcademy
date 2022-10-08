package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer between 1 and 100: ");
        int i;
        int[] numbers = new int[100];
        int count = 0;
        while ((i = input.nextInt()) != 0) {
            numbers[count] = i;
            count++;
        }
        countNumbers(numbers);
    }

    public static void countNumbers(int[] numbers) {
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] == i)
                    count += 1;
            }
            if (count != 0) {
                System.out.println(i + " occurs " + count + (count > 1 ? " times" : " time"));
            }
        }
    }
}
