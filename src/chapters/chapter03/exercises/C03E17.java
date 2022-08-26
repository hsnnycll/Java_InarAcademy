package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor(0), rock(1), paper(2):");
		int user = input.nextInt();
		
		int computer = (int)(Math.random() * 3);
		
		if (user == computer)
			System.out.println("It is a draw.");
		else if (user == 0 && computer == 1)
			System.out.println("The computer is rock. You are scissor. Computer won.");
		else if (user == 0 && computer == 2)
			System.out.println("The computer is paper. You are scissor. You won.");
		else if (user == 1 && computer == 0)
			System.out.println("The computer is scissor. You are rock. You won.");
		else if (user == 1 && computer == 2)
			System.out.println("The computer is paper. You are rock. Computer won.");
		else if (user == 2 && computer == 1)
			System.out.println("The computer is rock. You are paper. You won.");
		else if (user == 2 && computer == 0)
			System.out.println("The computer is scissor. you are paper. Computer won.");
	}

}
