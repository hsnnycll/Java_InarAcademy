package chapters.chapterArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class C07E04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter the scores: ");
        int count = 0;
        double i;
        double sum = 0;
        while ((i = input.nextInt()) >= 0) {
            list.add(i);
            sum += i;
            count++;
        }

        double average = sum / count;

        int above = 0;
        int below = 0;
        for (int j = 0; j < count; j++) {
            if (list.get(j) == average || list.get(j) > average)
                above++;
            else
                below++;
        }

        System.out.println("The number of scores above or equal to average: " + above);
        System.out.println("The number of scores below average:" + below);
    }
}
