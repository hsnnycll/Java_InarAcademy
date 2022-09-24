package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
    int count = 0;
        for(int i = 0; i < str2.length(); i++) {
            int j = str1.charAt(i);
            int k = str2.charAt(i);
            if (k == j) {
                count++;
            }else
                break;
        }
        if (count == 0){
            System.out.println(str1 + " and " + str2 + " has no common prefix.");
        }else
            System.out.println(str1.substring(0 , count));
    }
}
