package weeks.week_03;

import java.util.Scanner;

public class Assignment03_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your year of service: ");
		
		int year = input.nextInt();
		
		if ( year > 5) {
			System.out.print("Enter your salary: ");
			double salary = input.nextDouble();
			double bonus = salary * 0.05;
			System.out.println("Your net bonus amount:" + bonus);
		}else 
			System.out.println("We regret to inform you that you don't have a bonus salary.");
		
	}

}
