package chapters.chapterSet;

import java.util.HashSet;
import java.util.Set;

public class C07E06 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        int number = 2;
        int count = 0;
        while (count < 50) {
            if (isPrime(set, count, number)) {
                set.add(number);
                count++;
            }
            number++;
        }

        System.out.println("The first 50 prime number are: ");
        for (Integer i : set) {
            System.out.printf("%4d", i);
            count++;
            if (count % 10 == 0) System.out.println("");
        }
    }

    public static boolean isPrime(Set set, int count, int number) {
        for (int i = 0; i < count; i++) {
            for (Object n : set) {
                if ((int) n <= Math.sqrt(number)) {
                    if (number % (int) n == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
