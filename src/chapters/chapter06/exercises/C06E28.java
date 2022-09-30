package chapters.chapter06.exercises;

public class C06E28 {
    public static void main(String[] args) {
        System.out.println("p           2^p-1");
        System.out.println("----------------------");
        for (int p = 2; p <= 31 ; p++) {
            if(isPrime(p)){
                System.out.printf("%d\t\t\t%d\n", p , (int)(Math.pow(2, p) - 1));
            }

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
