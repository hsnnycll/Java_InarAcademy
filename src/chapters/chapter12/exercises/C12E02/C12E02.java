package chapters.chapter12.exercises.C12E02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C12E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean isValid = false;
        while (!isValid) {
            System.out.println("Enter two integers: ");
            try {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println("The sum of the numbers is " + (num1 + num2));
                isValid = true;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input");
                input.nextLine();
            }
        }
    }
}
