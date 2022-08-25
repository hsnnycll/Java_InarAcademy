package chapters.chapter03.checkpoints;

import java.util.Scanner;

public class CheckPoint3_20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		System.out.println((x - 5) < 4.5 && (x - 5) > -4.5);
		System.out.println((x - 5) > 4.5 || (x - 5) < -4.5);
	}

}
