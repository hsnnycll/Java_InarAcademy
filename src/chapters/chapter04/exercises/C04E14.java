package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		char ch = input.next().charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch == 'A')
			System.out.println("The numeric value for grade " + ch + " is 4");
		else if ( ch == 'B')
			System.out.println("The numeric value for grade " + ch + " is 3");
		else if (ch == 'C')
			System.out.println("The numeric value for grade " + ch + " is 2");
		else if (ch == 'D')
			System.out.println("The numeric value for grade " + ch + " is 1");
		else if (ch == 'E')
			System.out.println("The numeric value for grade " + ch + " is 0");
		else
			System.out.println(ch + " is an invalid grade");
	}

}
