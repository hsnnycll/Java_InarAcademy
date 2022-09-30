package chapters.chapter06.exercises;

public class C06E26 {
    public static void main(String[] args) {
        System.out.println("The first 100 palindromic prime numbers are \n");
        printPalindromicPrimeNumbers(100);
    }

    public static void printPalindromicPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number) && isPalindrome(number)) {
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

    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
}