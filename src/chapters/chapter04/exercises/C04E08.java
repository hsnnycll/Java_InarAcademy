package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an ASCII code: ");
		int asci = input.nextInt();
		
		char ch = (char)asci;
		
		System.out.println("The character for ASCII code " + asci + " is " + ch);
	}

}
