package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int j = str.charAt(i);
            if ('A' <= j && j <= 'Z'){
                count++;
            }
        }
        System.out.print("The number of uppercase letters is " + count);
    }
}
