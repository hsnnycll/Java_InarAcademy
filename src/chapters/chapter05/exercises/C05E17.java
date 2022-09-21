package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int line = input.nextInt();
		for (int i = 1; i <= line; i++) {
			int n = line - i;
			for (int space = 0; space < n; space++) {
				System.out.print("  ");
			}
			for (int leftSideNumbers = i; leftSideNumbers > 1; leftSideNumbers--) {
				System.out.print(leftSideNumbers + " ");
			}
			for (int rightSideNumbers = 1; rightSideNumbers <= i; rightSideNumbers++) {
				System.out.print(rightSideNumbers + " ");
			}
			System.out.println();
		}
	}
}
