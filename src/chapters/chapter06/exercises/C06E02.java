package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        System.out.println("The sum of digits of " + number + " is " + sumDigits(number));
    }
    
    public static int sumDigits(long n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
