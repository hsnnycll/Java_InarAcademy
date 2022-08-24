package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes: ");
		//How many minutes in one day
		int minutesInDay = 60 * 24;
		
		//How many minutes in one year, assumed a year has 365 days
		int minutesInYear = minutesInDay * 365;
		int minutes = input.nextInt();
		int years = minutes / minutesInYear;
		int days = (minutes % minutesInYear) / (minutesInDay);
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}

}
