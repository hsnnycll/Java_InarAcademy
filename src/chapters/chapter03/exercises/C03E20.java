package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the remperature in Fahrenheit between -58F and 41F: ");
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		double temperature = input.nextDouble();
		double wind = input.nextDouble();
		double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(wind, 0.16)) + 
				(0.4275 * temperature * Math.pow(wind, 0.16));
		
		if (temperature < -58 || temperature > 41)
			System.out.println("The invalid value.");
		else if (wind < 2)
			System.out.println("The invalid value.");
		else
			System.out.println("The wind chill index is " + windChill);

}
}