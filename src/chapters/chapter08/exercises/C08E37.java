package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] capitals = {{"Turkey", "Ankara" }, {"Azerbeycan", "Bakü" }, {"Fransa", "Paris" }, {"Almanya", "Berlin" }};
        int count = 0;
        for (int row = 0; row < capitals.length; row++) {
            System.out.println("Where is the capital of " + capitals[row][0] + " ?");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(capitals[row][1])) {
                System.out.println("Your answer is correct.");
                count++;
            } else {
                System.out.println("The correct answer should be " + capitals[row][1]);
            }
        }
        System.out.println("The correct count is " + count);
    }
}
