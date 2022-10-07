package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudent = input.nextInt();

        int scores[] = new int[numStudent];
        System.out.println("Enter " + numStudent + " scores: ");
        int best = 0;
        for (int i = 0; i < numStudent; i++) {
            scores[i] = input.nextInt();
            if (best < scores[i])
                best = scores[i];
        }
        printGrade(scores, best);
    }

    public static void printGrade(int[] scores, int best) {
        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else
                grade = 'F';
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
        }
    }
}
