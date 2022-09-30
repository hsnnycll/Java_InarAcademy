package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        int count = 0;
        for (int i = 1; i <= n * n; i++) {
            int matrix = (int) (Math.random() * 2);
            System.out.print(matrix + " ");
            count++;
            if (count % n == 0)
                System.out.println();
        }
    }
}
