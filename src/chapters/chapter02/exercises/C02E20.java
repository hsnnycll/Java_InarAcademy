package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		double interest = balance * (annualInterestRate / 1200);
		System.out.println("The interest is " + interest);
	}

}
