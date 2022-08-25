package chapters.chapter03.checkpoints;

import java.util.Scanner;

public class CheckPoint3_09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x > 2)
			if ( y > 2) {
				int z = x + y;
				System.out.println("z is " + z);
			}
			else
				System.out.println("x is " + x);				
		}
		
	}

