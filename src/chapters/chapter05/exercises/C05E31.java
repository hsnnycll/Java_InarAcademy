package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount (e.g., 10000): ");
		System.out.println("Enter the annual percentage yield (e.g., 5.75): ");
		System.out.println("Enter the number of months (e.g., 18): ");
		
		double amount = input.nextDouble();
		double annualYield = input.nextDouble();
		double month = input.nextDouble();
		
		System.out.println("Month    CD Value");
		for (int a = 1; a <= month; a++) {
			amount *= annualYield / 1200 + 1.0D;
			System.out.printf("%2d%15.2f\n", a, amount);
		}
	}
}
