package chapters.chapter11.exercises.C11E16;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            if(list.contains(answer)){
                System.out.println("You already entered " + answer);
                System.out.print("What is " + number1 + " + " + number2 + "? ");
                answer = input.nextInt();
            }else {
                System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + " ? ");
                list.add(answer);
                answer = input.nextInt();

            }
        }
        System.out.println("You got it!");
    }
}
