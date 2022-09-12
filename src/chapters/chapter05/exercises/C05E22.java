package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an Loan Amount: ");
		System.out.println("Enter Number of Years: ");
		System.out.println("Enter Annual Interest Rate: ");

		double amount = input.nextDouble();
		int year = input.nextInt();
		double annualRate = input.nextDouble();

		double monthlyRate = annualRate / 1200;
		double monthlyPayment = amount * monthlyRate / 
				(1 - 1 / Math.pow(1 + monthlyRate, year * 12));
		double totalPayment = monthlyPayment * year * 12;

		System.out.printf("Monthly Payment: %.2f", monthlyPayment);
		System.out.printf("\nTotal Payment: %.2f", totalPayment);
		System.out.print("\nPayment#       Interest        Principal        Balance");

		double balance = amount;
		double principal;
		double interest;
		for (int i = 1; i <= year * 12; i++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("\n%1d", i);
			System.out.printf("\t\t%.2f", interest);
			System.out.printf("\t\t%.2f", principal);
			System.out.printf("\t\t%.2f", balance);
		}
	}
}
