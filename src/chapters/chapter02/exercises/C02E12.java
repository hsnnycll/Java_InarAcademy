package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed(m/s) and acceleration(m/s^2): ");
		
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		double length = Math.pow(v, 2) / (2 * a);
		
		System.out.println("The minimum runway length for this airplane is " + (int)(length * 1000) / 1000.0);
		
	}

}
