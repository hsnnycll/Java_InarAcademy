package chapters.chapter02.exercises;

import java.util.Scanner;

public class C02E05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		
		double gratuity = subtotal * (rate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}

}
