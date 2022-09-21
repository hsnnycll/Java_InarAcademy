package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		int negatives = 0;
		int positives = 0;
		double sum = 0;
		double average = 0;
		int number = 1;
		while (number != 0) {
			number = input.nextInt();
			if (number < 0)
				negatives++;
			else if (number > 0)
				positives++;
			else
			break;
			sum += number;
			average = sum / (positives + negatives);
		}
		System.out.println("The number of positives is " + positives);
		System.out.println("The number of negatives is " + negatives);
		System.out.println("The total is " + sum);
		System.out.println("The average is " + average);
	}

}
