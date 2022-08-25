package chapters.chapter03.checkpoints;

import java.util.Scanner;

public class CheckPoint3_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int score = input.nextInt();
		
		// Akış ters olduğu için hatalı output alınıyor.
		
	if (score >= 60.0)
		System.out.println("D");
	else if (score >= 70.0)
		System.out.println("C");
	else if (score >= 80.0)
		System.out.println("B");
	else if (score >= 90.0)
		System.out.println("A");
	else
		System.out.println("F");
		
		}
		
		}


