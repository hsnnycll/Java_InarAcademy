package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your text:");
		String text = input.nextLine();
		
		System.out.println("The length of text is " + text.length() +
				" and the first character is " + text.charAt(0));
	}

}
