package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String number = input.nextLine();
		
		if (number.length() != 11 )
			System.out.println(number + " is an invalid social security number");
		else
			System.out.println(number + " is a valid social security number");
	}

}
