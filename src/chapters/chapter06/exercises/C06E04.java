package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        reverse(num);
    }
    public static void reverse(int number){
        String numberReversed = "";
        while (number > 0) {
            int t = number % 10;
            number /= 10;
            numberReversed += t;
        }
        System.out.println(numberReversed);
    }
}
