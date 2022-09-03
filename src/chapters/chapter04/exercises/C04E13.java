package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String str = input.next();
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		
		if (ch > 'Z' || ch < 'A')
			System.out.println("Invalid input");
		else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			System.out.println(str + " is a vowel");
		else 
			System.out.println(str + " is a constant");
		
		
		
	}

}
