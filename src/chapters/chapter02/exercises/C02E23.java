package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the driving distance: ");
		System.out.println("Enter miles per gallon: ");
		System.out.println("Enter price per gallon: ");
		double distance = input.nextDouble();
		double milesPerGallon = input.nextDouble();
		double pricePerGallon = input.nextDouble();
		
		double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
		System.out.println("The cost of driving is $" + costOfDriving);
	}

}
