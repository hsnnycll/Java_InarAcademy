package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year (e.g., 2016): ");
		System.out.println("Enter month 1-12: ");
		System.out.println("Enter of the day of the month: ");
		
		int year = input.nextInt();
		int month = input.nextInt();
		int dayOfMonth = input.nextInt();
		
		if(month == 1) { 
			month = 13;
			year -= 1;
		}
		else if (month == 2) {
			month = 14;
			year -= 1;
		}
		else {
			month = month;
		}
		
		int h = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100) + (year % 100) / 4 + 
				(year / 100)/ 4 + 5 *(year / 100)) % 7;
		
		if (h == 0)
			System.out.println("Day of the week is Saturday.");
		 else if ( h == 1)
			System.out.println("Day of the week is Sunday.");
		 else if (h == 2)
			System.out.println("Day of the week is Monday.");
		 else if (h == 3)
			System.out.println("Day of the week is Tuesday.");
		 else if (h == 4)
			 System.out.println("Day of the week is Wednesday.");
		 else if (h == 5)
			 System.out.println("Day of the week is Thursday");
		 else if (h == 6)
			 System.out.println("Day of the week is Friday.");
	
	}

}
