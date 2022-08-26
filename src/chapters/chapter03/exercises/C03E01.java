package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a , b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		
		if (discriminant > 0) {
			double r1 = ((-b + Math.pow(discriminant, 0.5)) / (2 * a));
			double r2 = ((-b - Math.pow(discriminant, 0.5)) / (2 * a));
			System.out.print("The equation has two roots: " + r1 + " and " + r2);
		}
		else if (discriminant == 0) {
			double r = ((-b + Math.pow(discriminant, 0.5)) / (2 * a));
			System.out.print("The equation has one root: " + r);
		}
		else 
			System.out.print("The equation has no real roots");
		
	}


}
