package chapters.chapter01.listings;

import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter annual interest rate in percentage, e.g., 7.5%
		System.out.println("Enter annual interest rate, e.g., 7.25%: ");
		double annualInterestRate = input.nextDouble();
		
		//Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter number of years
		System.out.println("Enter number of years as integer, e.g., 5: ");
		int numberOfYears = input.nextInt();
		
		//Enter loan amount
		System.out.println("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = input.nextDouble();
		
		//Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment  = monthlyPayment * numberOfYears * 12;
		
		//Display results
		System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
				
		
		
	}

}
