package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN as integer : ");

		int number = input.nextInt();
		final int isbn = number;

		int checksum = 0;
		int divisor = 100000000;
		for (int i = 1; i < 10; i++) {
			checksum += number / divisor * i;
			number %= divisor;
			divisor /= 10;
		}
		if (checksum % 11 == 10) {
			System.out.println(isbn + "X");
		} else {
			System.out.println(isbn + "" + checksum % 11);
		}
	}
}
