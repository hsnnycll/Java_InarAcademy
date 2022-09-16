package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor(0), rock(1), paper(2):");

		
		int userWin = 0;
		int computerWin = 0;
		
		while(userWin - computerWin < 2) {
			int computer = (int)(Math.random() * 3);
			int user = input.nextInt();
		}
		System.out.println();
	}

}
