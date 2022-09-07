package chapters.chapter05.listings;

import java.util.Scanner;

public class SubtractionQuizLoop {
	public static void main(String[] args) {
		final int NUMBER_OF_QUESTİONS = 5;
		int correctCount = 0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output = " ";
		Scanner input = new Scanner(System.in);

		while (count < NUMBER_OF_QUESTİONS) {
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);

			if (number1 < number2) {
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			System.out.print("What is " + number1 + " - " + number2 + "? ");
			int answer = input.nextInt();

			if (number1 - number2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			} else
				System.out.println(
						"your answer is wrong.\n" + number1 + " - " + number2 + " sould be " + (number1 - number2));

			count++;
			output += "\n" + number1 + "-" + number2 + "=" + answer
					+ ((number1 - number2 == answer) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println(
				"Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
	}

}
