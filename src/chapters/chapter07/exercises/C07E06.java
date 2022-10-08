package chapters.chapter07.exercises;

public class C07E06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int[] primeNumbers = new int[NUMBER_OF_PRIMES];

        int index = 0;
        for (int i = 2; index < NUMBER_OF_PRIMES; i++) {
            if (isPrime(i))
                primeNumbers[index++] = i;
        }
        System.out.println("The first 50 prime number are: ");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%4d", primeNumbers[i]);
            if ((i + 1) % NUMBER_OF_PRIMES_PER_LINE == 0) System.out.println("");
        }
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}

