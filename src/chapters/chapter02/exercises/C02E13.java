package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount: ");
		
		double amount = input.nextDouble();
		double interestRate = 1 + 0.00417;
		
		double month1 = amount * interestRate;
		double month2 = (100 + month1) * interestRate;
		double month3 = (100 + month2) * interestRate;
		double month4 = (100 + month3) * interestRate;
		double month5 = (100 + month4) * interestRate;
		double month6 = (100 + month5) * interestRate;
		
		System.out.println("After the sixth month, the account value is $" + month6);
	}

}
