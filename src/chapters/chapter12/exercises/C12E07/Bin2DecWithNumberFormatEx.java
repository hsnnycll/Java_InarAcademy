package chapters.chapter12.exercises.C12E07;

import java.util.Scanner;

public class Bin2DecWithNumberFormatEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a binary number: ");
            try {
                String bin = input.next();
                int dec = bin2Dec(bin);
                System.out.println("The decimal value for binary number " + bin + " is " + dec);
                break;
            } catch (Exception ex) {
                System.out.println("The number is not a binary number");
            }
        }
    }

    public static int bin2Dec(String bin) {
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                throw new NumberFormatException();
            }
        }
        int result = 0;
        int p = 0;
        for (int j = bin.length() - 1; j >= 0; j--) {
            if (bin.charAt(j) == '1') {
                result += Math.pow(2, p);
            }
            p++;
        }
        return result;
    }
}
