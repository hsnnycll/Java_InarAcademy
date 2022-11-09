package chapters.chapter10.exercises.C10E05;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 2; i <= number && number != 1; i++) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
                i = 1;
            }
        }

        while(!stack.empty()){
            System.out.print(stack.pop() + ", ");
        }
    }
}
