package chapters.chapter05.exercises;

public class C05E33 {
	public static void main(String[] args) {

		int total = 0;
		for (int number = 6; number <= 10000; number++) {
			for (int divisor = number - 1; divisor > 0; divisor--) {
				if (number % divisor == 0)
					total += divisor;
			}
			if (number == total)
				System.out.println(number);
			total = 0;
		}
	}
}
