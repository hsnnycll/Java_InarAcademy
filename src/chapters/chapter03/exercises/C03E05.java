package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day(for example for sunday enter 0: ");
		System.out.print("Enter the number of days elapsed since today: ");
		
		int today = input.nextInt();
		int nextDay = input.nextInt();
		
		int nextDayNumber = (today + nextDay) % 7;
		
		switch (nextDayNumber) {
		case 0: System.out.println("The future day is Sunday"); break;
		case 1: System.out.println("The future day is Monday"); break;
		case 2: System.out.println("The future day is Thuesday"); break;
		case 3: System.out.println("The future day is Wednesday"); break;
		case 4: System.out.println("The future day is Thursday"); break;
		case 5: System.out.println("The future day is Friday"); break;
		case 6: System.out.println("The future day is Saturday"); break;
		}
		
	}

}
