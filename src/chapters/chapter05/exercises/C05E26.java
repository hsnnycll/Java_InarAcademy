package chapters.chapter05.exercises;

public class C05E26 {
    public static void main(String[] args) {
        double e = 1;
        double factorial = 0;

        int item = 10000;
        while (item <= 100000) {
            for (double i = 2; i <= item; i++) {
                factorial += i * (i-1);
                e += 1 / factorial;
            }
            System.out.println("e is " + e + " for i is " + item);
            item += 10000;
        }
    }
}
