package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The numbers of the letters of " + s + " is " + countLetters(s));
    }

    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                count++;
            }else if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                count++;
            }
        }
        return count;
    }
}
