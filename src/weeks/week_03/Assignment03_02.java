package weeks.week_03;

import java.util.Scanner;

public class Assignment03_02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ages of 3 people: ");

		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		int max;
		int min;

		if (age1 > age2 && age1 > age3) {
			max = age1;
			if (age2 < age3) {
				min = age2;
			} else
				min = age3;
		} else if (age2 > age1 && age2 > age3) {
			max = age2;
			if (age1 > age3) {
				min = age3;
			} else
				min = age1;
		} else {
			max = age3;
			if (age1 > age2) {
				min = age2;
			} else
				min = age1;
		}

		System.out.println("The youngest age: " + min + " The oldest age: " + max);
		
	}

}
