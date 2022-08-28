package weeks.week_03;

import java.util.Scanner;

public class Assignment03_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter 4 digit number: ");
			
		int number = input.nextInt();
			
		int digit1 = number / 1000;
		int digit2 = number / 100 % 10;
		int digit3 = number / 10 % 10;
		int digit4 = number % 10;
			
		System.out.println("Your number is " + digit4 + digit3 + digit2 + digit1);
					
	}

}
