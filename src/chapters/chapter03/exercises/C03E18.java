package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package:");
		double w = input.nextDouble();
		
		if (w > 0 && w <= 1)
			System.out.println("The cost of shipping is $3.5");
		else if (w > 1 && w <= 3)
			System.out.println("The cost of shipping is $5.5");
		else if (w > 3 && w <= 10)
			System.out.println("The cost of shipping is $8.5");
		else if (w > 10 && w <= 20)
			System.out.println("The cost of shipping is $10.5");
		else if (w > 20)
			System.out.println("The package cannot be shipped.");
	}

}
