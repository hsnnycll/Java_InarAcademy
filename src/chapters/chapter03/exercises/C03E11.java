package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the month number and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		switch (month) {
		case 1: System.out.print("31"); break;
		case 2:
		 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		   System.out.print("28");
		 else
			 System.out.print("29"); break;
		case 3: System.out.print("31"); break;
		case 4: System.out.print("30"); break;
		case 5: System.out.print("31"); break;
		case 6: System.out.print("30"); break;
		case 7: System.out.print("31"); break;
		case 8: System.out.print("31"); break;
		case 9: System.out.print("30"); break;
		case 10: System.out.print("31"); break;
		case 11: System.out.print("30"); break;
		case 12: System.out.print("31"); break;
		
		}
		
	}

}
