package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println("Celsius " + celsius + " is " + fahrenheit + " Fahrenheit.");
	}

}
