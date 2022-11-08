package chapters.chapter10.exercises.C10E03;

import java.util.Scanner;

public class UseMyInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer numbers: ");
        MyInteger number = new MyInteger(input.nextInt());
        MyInteger number2 = new MyInteger(input.nextInt());

        System.out.println("getValue(): " + number.getValue());
        System.out.println("isEven(): " + number.isEven());
        System.out.println("isOdd(): " + number.isOdd());
        System.out.println("isPrime(): " + number.isPrime());

        System.out.println("isEven(" + number2.getValue() + ") static: " + MyInteger.isEven(number2));
        System.out.println("isOdd(" + number2.getValue() + ") static: " + MyInteger.isOdd(number2));
        System.out.println("isPrime(" + number2.getValue() + ") static: " + MyInteger.isPrime(number2));

        System.out.println("equals(" + number.getValue() + "): " + number.equals(number2));
        System.out.println("equals(MyInteger(" + number.getValue() + ")): " + number.equals(number2));

        String str = Integer.toString(number.getValue());
        char[] array = new char[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
        }

        System.out.println("parseInt(char[]{}) static: " + MyInteger.parseInt(array));
        System.out.println("parseInt(String ) static: " + MyInteger.parseInt(Integer.toString(number.getValue())));
    }
}
