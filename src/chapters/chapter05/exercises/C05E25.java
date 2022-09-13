package chapters.chapter05.exercises;

public class C05E25 {
	public static void main(String[] args) {

		double pi = 0;
		for (int i = 1; i <= 100000; i++) {
			pi += (Math.pow((-1), (i + 1))) / (2 * i - 1);
			if (i % 10000 == 0) {
				System.out.println("The pi value for  " + i + " : " + (4 * pi));
			}
		}
	}
}
