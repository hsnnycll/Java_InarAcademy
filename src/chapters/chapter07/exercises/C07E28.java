package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    System.out.print("[" + numbers[i] + ", " + numbers[j] + "]" + " ");
                }
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }
}
