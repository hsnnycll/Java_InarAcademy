package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop: ");
        int numBalls = input.nextInt();
        System.out.println("Enter the number of slots: ");
        int numSlots = input.nextInt();
        String[] leftOrRight;
        leftOrRight = getPath(numBalls, numSlots);

        for (int i = 0; i < leftOrRight.length; i++) {
            System.out.println(leftOrRight[i]);
        }
    }

    public static String[] getPath(int numBalls, int numSlots) {
        String[] result = new String[numBalls];
        for (int j = 0; j < numBalls; j++) {
            String rOrL = "";
            for (int i = 0; i < numSlots - 1; i++) {
                int random = (int) (Math.random() * 2);
                if (random == 0)
                    rOrL += "R";
                else
                    rOrL += "L";
            }
            result[j] = rOrL;
        }
        return result;
    }
}