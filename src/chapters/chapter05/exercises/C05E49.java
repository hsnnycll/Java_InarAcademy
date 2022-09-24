package chapters.chapter05.exercises;

import java.util.Locale;
import java.util.Scanner;

public class C05E49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        String str2 = str.toLowerCase();
        System.out.println(str2);
        for (int i = 0; i < str.length(); i++) {
            int j = str2.charAt(i);
            if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u'){
                vowels++;
            }else if (j == 32){
                continue;
            }else
                consonants++;
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
