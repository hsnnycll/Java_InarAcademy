package chapters.chapter06.exercises;

public class C06E27 {
    public static void main(String[] args) {
        System.out.println("The first 100 emirps numbers are \n");
        printEmirpsNumbers(100);
    }

    public static void printEmirpsNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 13;

        while (count < numberOfPrimes) {
            if (isPrime(number) && isPrime(reverse(number))) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-10s\n", number);
                } else
                    System.out.printf("%-10s", number);
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int number) {
        String numberReversed = "";
        while (number > 0) {
            int t = number % 10;
            number /= 10;
            numberReversed += t;
        }
        return Integer.parseInt(numberReversed);
    }
}
