package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(isPalindrome(number)) {
            System.out.println(number + " is a palindrome");
        }else
            System.out.println(number + " is not a palindrome");
    }
    public static int reverse(int number) {
        String numberReversed = "";
        while (number > 0) {
            int t = number % 10;
            number /= 10;
            numberReversed += t;
        }
        return Integer.parseInt(numberReversed);
    }
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
}
