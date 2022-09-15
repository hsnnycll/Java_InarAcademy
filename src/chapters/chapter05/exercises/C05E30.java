package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount (e.g., 100): ");
		System.out.println("Enter the annual interest rate (e.g., 5): ");
		System.out.println("Enter the number of months (e.g., 6): ");
		
		double amount = input.nextDouble();
		double annualRate = input.nextDouble();
		double month = input.nextDouble();
		
		double totalAmount = 0;
		for (int a = 1; a <= month; a++) {
			totalAmount = (amount + totalAmount) * (1 + ((annualRate / 100) / 12));
		}
		System.out.printf("The amount in the savings account after the given month is %.3f",  totalAmount);
	}
}
