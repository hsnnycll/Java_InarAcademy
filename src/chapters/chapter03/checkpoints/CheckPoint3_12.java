package chapters.chapter03.checkpoints;

import java.util.Scanner;

public class CheckPoint3_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		
		boolean even = count % 10 == 0;
		System.out.println(even);
	}

}
