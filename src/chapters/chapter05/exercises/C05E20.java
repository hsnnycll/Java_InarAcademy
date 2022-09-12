package chapters.chapter05.exercises;

public class C05E20 {
	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		while (number <= 1000) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count % 8 == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			number++;
		}
	}

}
