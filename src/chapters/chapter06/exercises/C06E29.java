package chapters.chapter06.exercises;

public class C06E29 {
    public static void main(String[] args) {
        System.out.println("The twin primes less than: ");
        getTwinPrimes(1000);
    }

    public static void getTwinPrimes(int endOfNumber) {
        int number = 2;
        while (number < endOfNumber) {
            if (isPrime(number) && isPrime(number + 2)) {
                System.out.println("(" + number + ", " + (number + 2) + ")");
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
}
