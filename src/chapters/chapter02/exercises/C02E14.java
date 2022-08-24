package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		System.out.println("Enter height in inches: ");
		
		double pounds = input.nextDouble();
		double inches = input.nextDouble();
		
		double kilograms = pounds * 0.45359237;
		double meters = inches * 0.0254;
		
		double BMI = kilograms / Math.pow(meters, 2);
		System.out.println("BMI is " + (int)(BMI * 10000) / 10000.0);
		
	}

}
