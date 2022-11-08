package chapters.chapter10.exercises.C10E05;

import java.util.Scanner;

public class C10E05 {
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

        StackOfIntegers reversedStack = new StackOfIntegers();
        while(!stack.empty()){
            System.out.print(stack.peek() + ", ");
            reversedStack.push(stack.pop());
        }
    }

}
