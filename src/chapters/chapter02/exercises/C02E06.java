package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		int integer = input.nextInt();
		int firstdigit = integer % 10;
		int seconddigit = (integer % 100) / 10;
		int thirddigit = integer / 100;
		int sum = firstdigit + seconddigit + thirddigit;
		
		System.out.println("The sum of the digits is " + sum);
	}

}
