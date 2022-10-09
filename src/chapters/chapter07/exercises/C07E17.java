package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = input.nextInt();
        System.out.println("Enter the students name and their scores(Pls enter a space between name and score): ");
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            names[i] = input.next();
            scores[i] = input.nextInt();
        }
        System.out.println("The student names in decreasing order of their scores: ");
        Sort(names, scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " = " + scores[i]);
        }
    }

    public static void Sort(String[] names, int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int maxValue = scores[i];
            int maxIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (maxValue < scores[j]) {
                    maxValue = scores[j];
                    maxIndex = j;

                }
            }
            if (maxIndex != i) {
                String temp = names[i];
                names[i] = names[maxIndex];
                names[maxIndex] = temp;
                scores[maxIndex] = scores[i];
                scores[i] = maxValue;
            }
        }
    }
}
