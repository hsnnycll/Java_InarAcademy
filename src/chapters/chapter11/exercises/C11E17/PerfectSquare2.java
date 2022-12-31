package chapters.chapter11.exercises.C11E17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        findFactors(m, factors);
        int n = findN(factors);
        int perfectSquare = m * n;
        System.out.println("The smallest number n for m * n to be a perfect square is " + n + " m * n is " + perfectSquare);

    }

    public static void findFactors(int m, ArrayList<Integer> factors) {
        int condition = m / 2 + 1;
        for (int i = 2; i < condition; i++) {
            while (m % i == 0 && m != 0){
                factors.add(i);
                m /= i;
            }
        }
    }

    public static int findN(ArrayList<Integer> factors) {
        int n = 1;
        ArrayList<Integer> distinct = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int count = 0;
            for (int j = 0; j < factors.size(); j++) {
                if (factors.get(i) == factors.get(j) && !distinct.contains(factors.get(i))){
                    count++;
                }
            }
            if (count % 2 !=0 && count != 0){
                n *= factors.get(i);
            }
            distinct.add(factors.get(i));
        }
        return n;
    }
}
