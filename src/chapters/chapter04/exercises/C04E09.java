package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		String str = input.nextLine();
		
		char ch = str.charAt(0);
		
		System.out.println("The Unicode for the character " + str + " is " + (int)ch);
	}

}
