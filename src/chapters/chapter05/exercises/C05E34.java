package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int computerCount = 0;
		int userCount = 0;
		int computer = 0;

		while (computerCount < 3 && userCount < 3) {
			computer = (int) (Math.random() * 3);

			System.out.println("scissor (0), rock (1), paper(2) : ");
			int user = input.nextInt();

			if (computer == 0 && user == 1) {
				System.out.println("The computer is scissor. You are rock. You won");
				userCount++;
			} else if (computer == 1 && user == 2) {
				System.out.println("The computer is rock. You are paper. You won");
				userCount++;
			} else if (computer == 2 && user == 0) {
				System.out.println("The computer is paper. You are scissor. You won");
				userCount++;
			} else if (computer == 0 && user == 2) {
				System.out.println("The computer is scissors. You are paper. You lose");
				computerCount++;
			} else if (computer == 1 && user == 0) {
				System.out.println("The computer is rock. You are scissor. You lose");
				computerCount++;
			} else if (computer == 2 && user == 1) {
				System.out.println("The computer is paper. You are rock. You lose");
				computerCount++;
			} else if (computer == user) {
				System.out.print("The computer is ");
				if (computer == 0)
					System.out.println("scissor. You are scissor too. It is a draw.");
				else if (computer == 1)
					System.out.println("rock. You are rock too. It is a draw.");
				else if (computer == 2)
					System.out.println("paper. You are paper too. It is a draw.");
			}
		}
		System.out.println("Computer is " + computerCount + "\n" + "Player is " + userCount);
	}

}
