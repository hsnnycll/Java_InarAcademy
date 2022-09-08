package chapters.chapter05.checkpoints;

public class CheckPoint5_13 {
	public static void main(String[] args) {
		
		long sum = 0;
		int i = 0;
		do {
			sum += ++i;
		}
		while (i <= 1000);
		System.out.println(sum);
	}
}
