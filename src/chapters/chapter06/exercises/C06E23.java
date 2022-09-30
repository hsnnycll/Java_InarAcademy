package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Enter a character: ");
        String str2 = input.next();
        char ch = str2.charAt(0);
        System.out.println("The number of occurrences of " + ch + " in the "+ str + " is " + count(str, ch));
    }

    public static int count(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
