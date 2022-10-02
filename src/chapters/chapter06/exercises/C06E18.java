package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("■ A password must have at least eight characters.\n" +
                "■ A password consists of only letters and digits.\n" +
                "■ A password must contain at least two digits.");
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (isEightCharacters(password) && isOnlyLettersAndDigits(password) && isAtLeastTwoDigits(password))
            System.out.println("Valid Password.");
        else
            System.out.println("Invalid Password.");
    }

    public static boolean isEightCharacters(String password) {
        if (password.length() < 8)
            return false;
        else
            return true;
    }

    public static boolean isOnlyLettersAndDigits(String password){
        boolean isOnly = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z') || ('0' <= ch && ch <= '9'))
                isOnly = true;
            else 
                isOnly = false;
            break;
        }
        return isOnly;
    }

    public static boolean isAtLeastTwoDigits(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if ('0' <= ch && ch <= '9')
                count++;
        }
        if (count >= 2)
            return true;
        else
            return false;
    }
}
