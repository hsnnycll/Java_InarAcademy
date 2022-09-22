package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the first day of the year (i.e. for Tuesday enter 2): ");
		int monthDays = input.nextInt();

		String day = "";
		String monthName = "";
		for (int month = 1; month <= 12; month++) {
			switch (month) {
			case 1:
				monthName = "January";
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					monthName = "February";
					monthDays += 29;
				}else
					monthName = "February";
					monthDays += 28;
				break;
			case 3:
				monthName = "March";
				monthDays += 31;
				break;
			case 4:
				monthName = "April";
				monthDays += 30;
				break;
			case 5:
				monthName = "May";
				monthDays += 31;
				break;
			case 6:
				monthName = "June";
				monthDays += 30;
				break;
			case 7:
				monthName = "July";
				monthDays += 31;
				break;
			case 8:
				monthName = "August";
				monthDays += 31;
				break;
			case 9:
				monthName = "September";
				monthDays += 30;
				break;
			case 10:
				monthName = "October";
				monthDays += 31;
				break;
			case 11:
				monthName = "November";
				monthDays += 30;
				break;
			case 12:
				monthName = "December";
				monthDays += 31;
				break;
			}
			monthDays  %= 7;
			switch (monthDays) {
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
			System.out.println(monthName + " 1 ," + year + " is " + day);
		}

	}
}
