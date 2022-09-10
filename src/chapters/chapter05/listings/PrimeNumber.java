package chapters.chapter05.listings;

public class PrimeNumber {
	public static void main(String[] args) {
		final int NUMBER_OF_PRİMES = 50;
		final int NUMBER_OF_PRİMES_PER_LİNE = 10;
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness

		System.out.println("The first 50 prime number are \n");

		while (count < NUMBER_OF_PRİMES) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if (count % NUMBER_OF_PRİMES_PER_LİNE == 0) {
					System.out.println(number);
				} else
					System.out.print(number + " ");
			}
			number++;
		}
	}
}
