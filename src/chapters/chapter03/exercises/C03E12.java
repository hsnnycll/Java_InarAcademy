package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		int d1 = number / 100 % 10;
		int d2 = number / 10 % 10;
		int d3 = number % 10;
		
		if (d1 == d3)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");
	}

}
