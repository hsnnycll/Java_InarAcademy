package chapters.chapter03.checkpoints;

public class CheckPoint3_31 {
	public static void main(String[] args) {
		
		int x = 1;
		int a = 3;
		
		if (a == 1)
			x += 5;
		else if (a == 2)
			x +=10;
		else if (a == 3)
			x += 16;
		else if (a == 4)
			x += 34;
		System.out.println(x);
		
		
		x = 1;
		switch (a) {
		case 1: x += 5; 
		break;
		case 2: x += 10; 
		break;
		case 3: x += 16; 
		break;
		case 4: x += 34; 
		break;
	}
		System.out.println(x);
	}
}
