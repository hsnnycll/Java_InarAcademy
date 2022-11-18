package chapters.chapter10.exercises.C10E06;

public class PrimeNumbers {
    public static void main(String[] args) {

        int number = 120;
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                stack.push(i);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + ", ");
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
