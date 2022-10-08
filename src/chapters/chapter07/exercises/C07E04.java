package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the scores: ");
        int[] scores = new int[100];
        int count = 0;
        int i;
        int sum = 0;
        while ((i = input.nextInt()) >= 0) {
            scores[count] = i;
            sum += i;
            count++;
        }

        double average = sum / count;

        int above = 0;
        int below = 0;
        for (int j = 0; j < count; j++) {
            if (scores[j] == average || scores[j] > average)
                above++;
            else
                below++;
        }
        System.out.println("The number of scores above or equal to average: " + above);
        System.out.println("The number of scores below average:" + below);

    }
}
