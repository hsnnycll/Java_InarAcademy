package chapters.chapter03.exercises;

import java.util.Scanner;

public class C03E19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the three edges for a triangle:");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x + y < z || y + z < x || x + z < y)
			System.out.println("İnvalid value");
		else 
			System.out.println("The perimeter of a triangle is " + (z + y + x));
	}

}
