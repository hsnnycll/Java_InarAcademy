package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Loan Amount: ");
		System.out.println("Enter Number Of Years: ");
		double amount = input.nextDouble();
		int year = input.nextInt();
		System.out.print("Interest Rate   Monthly Payment       Total Payment");
		
		for (double i = 5.0; i <= 8.0; i += 0.125) {
			double monthlyRate = i / 1200;
			double monthlyPayment = amount * monthlyRate / 
					(1 - 1 / Math.pow(1 + monthlyRate, year * 12));
			double totalPayment = monthlyPayment * year * 12;
			System.out.printf("\n%.3f%%", i);
			System.out.printf("\t\t%.2f", monthlyPayment);
			System.out.printf("\t\t\t%.2f", totalPayment);
		}
	}

}
