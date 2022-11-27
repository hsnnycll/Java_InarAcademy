package chapters.chapter11.exercises.C11E17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int number = input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        int m = number;
        for (int i = 2; i <= m; i++) {
            while (m % i == 0) {
                list.add(i);
                m /= i;
            }
        }
        int n = getN(list, number);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + number * n);
    }

    public static int getN(ArrayList<Integer> list, int m) {
        int n = 1;
        for (int i = 2; i < m; i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                n *= i;
            }
        }
        return n;
    }
}