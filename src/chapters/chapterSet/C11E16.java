package chapters.chapterSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C11E16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Set<Integer> set = new HashSet<>();
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            if(set.contains(answer)){
                System.out.println("You already entered " + answer);
                System.out.print("What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }else {
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ? ");
                set.add(answer);
                answer = input.nextInt();

            }
        }
        System.out.println("You got it!");
    }
}
