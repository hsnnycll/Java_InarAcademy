package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = (int)(Math.random() * 2);
		
		System.out.print("Enter the 0 for heads or 1 for tails: ");
		int guess = input.nextInt();
		
		if (number == guess)
			System.out.println("You are correct!");
		else
			System.out.println("Sorry, you are failed!");
	}

}
