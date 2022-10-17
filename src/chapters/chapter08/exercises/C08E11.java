package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 511: ");
        int number = input.nextInt();
        printHOrT(getBinaryValueOfNumber(number));
    }

    public static char[][] getBinaryValueOfNumber(int n) {
        char[][] binaryNumber = new char[3][3];
        String binary = "";
        while (n > 0) {
            int result = n % 2;
            n /= 2;
            binary += result;
        }
        if (binary.length() != 9) {
            while (binary.length() != 9) {
                binary = '0' + binary;
            }
        }
        int index = 0;
        for (int row = 0; row < binaryNumber.length; row++) {
            for (int column = 0; column < binaryNumber.length; column++) {
                binaryNumber[row][column] = binary.charAt(index);
                index++;
            }
        }
        return binaryNumber;
    }

    public static void printHOrT(char[][] binary) {
        for (int row = 0; row < binary.length; row++) {
            for (int column = 0; column < binary[row].length; column++) {
                if (binary[row][column] == '0') {
                    System.out.print("H ");
                } else {
                    System.out.print("T ");
                }
            }
            System.out.println();
        }
    }
}
