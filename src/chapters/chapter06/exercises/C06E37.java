package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {
        String strnumber = number + "";
        int count = width - strnumber.length();
        if (count <= 0) {
            return strnumber;
        } else {
            for (int i = 0; i < count; i++) {
                strnumber = '0' + strnumber;
            }
            return strnumber;
        }
    }
}
