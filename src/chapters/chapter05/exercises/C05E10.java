package chapters.chapter05.exercises;

public class C05E10 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 100; i < 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {
				System.out.printf("%d ", i);
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
