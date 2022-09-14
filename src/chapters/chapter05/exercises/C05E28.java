package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year: ");
		System.out.println("Enter the first day of the year (i.e. for Tuesday enter 2): ");
		int year = input.nextInt();
		int days = input.nextInt();

		String day = "";
		int monthDays = 0;
		for (int month = 1; month <= 12; month++) {
			switch (monthDays) {
			case 1:
				monthDays += 31;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
					monthDays += 29;
				else
					monthDays += 28;
			case 3:
				monthDays += 31;
			case 4:
				monthDays += 30;
			case 5:
				monthDays += 31;
			case 6:
				monthDays += 30;
			case 7:
				monthDays += 31;
			case 8:
				monthDays += 31;
			case 9:
				monthDays += 30;
			case 10:
				monthDays += 31;
			case 11:
				monthDays += 30;
			case 12:
				monthDays += 31;
			}
			switch (days) {
			case 0:
				day = "Sunday";
				break;
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4: 
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			}
		}
		System.out.println(day + year);
	}
}
