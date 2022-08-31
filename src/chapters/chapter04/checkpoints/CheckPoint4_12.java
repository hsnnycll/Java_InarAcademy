package chapters.chapter04.checkpoints;

public class CheckPoint4_12 {
	public static void main(String[] args) {

		char c = 'A';
		{
			int i = (int) c;
			System.out.println(i);
		}

		float f = 1000.34f;
		{
			int i = (int) f;
			System.out.println(i);
		}

		double d = 1000.34;
		{
			int i = (int) d;
			System.out.println(i);
		}
		
		int i = 97;
		{
		char c1 = (char)i;
		System.out.println(i);
		}

		}
	}

