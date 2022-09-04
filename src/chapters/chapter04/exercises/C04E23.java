package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter employee's name: ");
		System.out.println("Enter number of hours worked in a week: ");
		System.out.println("Enter hourly pay rate: ");
		System.out.println("Enter state tax withholding rate: ");
		System.out.println("Enter state tax withholding rate: ");
		
		String name = input.next();
		double hours = input.nextDouble();
		double payRate = input.nextDouble();
		double federalTax = input.nextDouble();
		double stateTax = input.nextDouble();
		
		double grossPay = hours * payRate;
		double tax1 = payRate * federalTax * 10;
		double tax2 = ((int)(payRate * stateTax * 1000)) / 100.0;
		double totalTax = tax1 + tax2;
		double netPay = grossPay - tax1 - tax2;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay + "\nDeductions:");
		System.out.println("Federal Withholding (" + federalTax + "): $" + tax1);
		System.out.println("State Withholding (" + stateTax + "): $" + tax2);
		System.out.println("Total Deduction: $" + totalTax);
		System.out.println("Net Pay: $" + netPay);
		
		
	}

}
