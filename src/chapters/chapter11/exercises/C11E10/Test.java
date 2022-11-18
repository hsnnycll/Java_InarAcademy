package chapters.chapter11.exercises.C11E10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string: ");
            String str = input.nextLine();
            stack.push(str);
        }
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "  ");
        }

    }
}
