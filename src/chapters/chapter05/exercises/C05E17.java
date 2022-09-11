package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		int l = input.nextInt();
		for(int i = 1; i <= l; i++) {
			for ( int a = 1; a <= i; a++) {
			System.out.print(a);
		}
			System.out.println();
	}
	}
}
