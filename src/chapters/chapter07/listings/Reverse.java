package chapters.chapter07.listings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = input.nextLine();

        char[] strArray = str.toCharArray();
        char[] reverseStr = reverse(strArray);

        System.out.println("The reverse of the string:");
        System.out.println(reverseStr);
    }

    public static char[] reverse(char[] strArray) {
        char[] reverseStr = new char[strArray.length];

        for (int i = 0, j = reverseStr.length - 1; i < reverseStr.length; i++, j--) {
            reverseStr[j] = strArray[i];
        }
        return reverseStr;
    }
}
