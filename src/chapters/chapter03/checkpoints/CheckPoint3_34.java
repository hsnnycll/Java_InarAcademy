package chapters.chapter03.checkpoints;

import java.util.Scanner;

public class CheckPoint3_34 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your ages: ");
		int ages = input.nextInt();
		
		System.out.println((ages >=16) ? "ticket price is 20" : "ticket price is 10");
	}

}
