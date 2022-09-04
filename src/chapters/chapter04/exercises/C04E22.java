package chapters.chapter04.exercises;

import java.util.Scanner;

public class C04E22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string s1: ");
		System.out.println("Enter string s2: ");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		
		if (s1.indexOf(s2) != -1)
			System.out.println(s2 + " is a substring of " + s1);
		else
			System.out.println(s2 + " is not a substring of " + s1);
	}

}
