package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        long n = input.nextLong();
        System.out.println("The square root of " + n + " is " + sqrt(n));
    }

    public static double sqrt(long n){
        double nextGuess = 1.2;
        double lastGuess = 1;
        while (nextGuess - lastGuess != 0){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return  nextGuess;
    }
}
