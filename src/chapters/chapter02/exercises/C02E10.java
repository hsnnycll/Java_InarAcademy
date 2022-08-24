package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water: ");
		System.out.println("Enter the initial temperature: ");
		System.out.println("Enter the final temperature: ");
		
		double M = input.nextDouble();
		double initialTemperature = input.nextDouble();
		double finalTemperature = input.nextDouble();
		
		double Q = M * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + Q );
	}

}
