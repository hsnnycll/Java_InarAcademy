package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = input.nextInt();

		String binary ="";
		while(number != 0) {
			binary = (number % 2) + binary;
			number /= 2;
		}
		System.out.println(binary);
	}

}
