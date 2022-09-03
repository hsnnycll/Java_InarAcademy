package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter point1 (latitude and longitude) in degrees: ");
		System.out.println("Enter point2 (latitude and longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		
		double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) 
				* Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The distance between the two points is " + d);
	}

}
