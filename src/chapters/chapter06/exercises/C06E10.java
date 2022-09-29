package chapters.chapter06.exercises;

import static chapters.chapter06.listings.PrimeNumberMethod.isPrime;

public class C06E10 {
    public static void main(String[] args) {

        System.out.println("The prime numbers less than 10000 are; ");
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;
        int lastNumber = 10000;
        while (number < lastNumber) {
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                } else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }
}
