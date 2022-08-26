package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// ax + by =e , cx + dy = f
		
		System.out.println("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		if ((a * d - b * c) == 0) {
			System.out.println("The equation has no solution.");
		}
		else 
			System.out.println("x is " + ((e * d - b * f) / (a * d - b * c)) + 
				   " and y is " + ((a * f - e * c) / (a * d - b * c)));
	
	}

}
