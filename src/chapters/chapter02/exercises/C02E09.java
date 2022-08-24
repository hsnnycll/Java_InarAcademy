package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0, v1, and t: ");
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t; 
		System.out.println("The average acceleration is " + (int)(a * 10000)/ 10000.0 );
	}

}
