package chapters.chapter12.exercises.C12E06;

import java.util.Scanner;

public class Hex2DecWithNumberFormatEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();
            try {
                int dec = hex2Dec(hex.toUpperCase());
                System.out.println("The decimal value for hex number " + hex + " is " + dec);
                break;
            } catch (Exception ex) {
                System.out.println("The string is not a hex string");
            }
        }
    }

    public static int hex2Dec(String hex) {
        for (int i = 0; i < hex.length(); i++) {
            if (!('A' <= hex.charAt(i) && hex.charAt(i) <= 'F') && !('0' <= hex.charAt(i) && hex.charAt(i) <= '9')) {
                throw new NumberFormatException();
            }
        }
        int dec = 0;
        int digitValue = 1;
        for (int i = hex.length() - 1; 0 <= i; i--) {
            char hexChar = hex.charAt(i);
            int decValue = hexCharToDec(hexChar);
            dec += decValue * digitValue;
            digitValue *= 16;
        }
        return dec;
    }

    public static int hexCharToDec(char ch) {
        if ('A' <= ch && ch <= 'F')
            return ch - 'A' + 10;
        else
            return ch - '0';
    }
}
