package chapters.chapter05.checkpoints;

public class CheckPoint5_25 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i < 4)
			if (i % 3 == 0)
				continue;
		sum += i;
		 i++;
		System.out.println(sum);
	}

}
