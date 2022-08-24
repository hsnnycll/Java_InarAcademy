package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		System.out.println("Enter annual interest rate in percentage: ");
		System.out.println("Enter number of years: ");
		double investmentAmount = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double years = input.nextDouble();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate / 1200), years * 12);
		
		System.out.println("Accumulated value is $" + futureInvestmentValue);
	
	}

}
