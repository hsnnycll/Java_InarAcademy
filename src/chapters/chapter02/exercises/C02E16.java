package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		double area = ((3 * (Math.pow(3, 0.5))) * Math.pow(side, 2) / 2);
		
		System.out.println("The area of hexagon is " + area);
	}

}
