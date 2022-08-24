package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount in double, for example 11.56 : ");
		double amount = input.nextDouble();
		
		int dolars = (int)amount;
		int cents = (int)(amount * 100) % 100;
		
		
		System.out.println("Your amount consist of " + dolars + " dolars and " + cents + " cents." );
	}

}
