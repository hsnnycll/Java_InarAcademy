package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first digits of an ISBN-13 as a string: ");
        String isbn = input.next();

        if (isbn.length() != 12) {
            System.out.println(isbn + " is an invalid input");
            System.exit(0);
        }

        String isbn13 = "";
        int checksum = 0;
        for(int i = 0; i < isbn.length(); i++) {
            if ((i+1) % 2 == 0) {
                checksum = checksum + Integer.parseInt(String.valueOf(isbn.charAt(i))) * 3;
            }else
                checksum = checksum + Integer.parseInt(String.valueOf(isbn.charAt(i)));
        }
        checksum = checksum % 10;
        checksum = 10 - checksum;
        if (checksum == 10)
            isbn13 = isbn + "0";
        else
            isbn13 = isbn + checksum;

        System.out.println("The ISBN-13 number is " + isbn13);
    }
}
