package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years: ");
		
		int year = input.nextInt();	
		double population = 312032486;
		double totalPopulation = population + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * year;
		
		System.out.println("The population in " + year + " years is " + (int)totalPopulation);
		
		
		
		
}
}