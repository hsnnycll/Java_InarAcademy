package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The 16 bits are ");
        for (int i = 15; i >= 0; i--) {
            System.out.print((number >> i) & 1);
        }
    }
}
