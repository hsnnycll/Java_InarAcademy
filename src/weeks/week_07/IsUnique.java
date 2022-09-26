package weeks.week_07;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str = input.nextLine();
        if (isUnique(str)) {
            System.out.println(str + " is a unique string");
        } else {
            System.out.println(str + " is not a unique string");
        }
    }

    public static boolean isUnique(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return false;
            }
        }
        return true;
    }
}

