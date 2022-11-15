package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers of slots : ");
        int slotNumber = input.nextInt();
        System.out.println("Enter the number of balls to drop: ");
        int ballNumber = input.nextInt();
        System.out.println();
        String[] paths = getPath(ballNumber, slotNumber);
        int[] slot = getSlot(ballNumber, slotNumber, paths);
        printPath(paths);
        System.out.println();
        printSlots(slot);
    }

    public static String[] getPath(int ballNumber, int slotNumber) {
        String[] paths = new String[ballNumber];
        for (int i = 0; i < ballNumber; i++) {
            String RL = "";
            for (int j = 0; j < slotNumber - 1; j++) {
                int fall = (int) (Math.random() * 2);
                if (fall == 1) {
                    RL += "R";
                } else {
                    RL += "L";
                }
            }
            paths[i] = RL;
        }
        return paths;
    }

    public static int[] getSlot(int ballNumber, int slotNumber, String[] paths) {
        int[] slot = new int[slotNumber + 1];
        for (int i = 0; i < ballNumber; i++) {
            int rightFalls = countRightFalls(paths[i]);
            slot[rightFalls + 1]++;
        }
        return slot;
    }

    public static int countRightFalls(String RL) {
        int rightCount = 0;
        for (int i = 0; i < RL.length(); i++) {
            if (RL.charAt(i) == 'R') {
                rightCount++;
            }
        }
        return rightCount;
    }


    public static void printPath(String[] paths) {
        for (int i = 0; i < paths.length; i++) {
            System.out.println(paths[i]);
        }
    }

    public static void printSlots(int[] slot) {
        int maxColumn = slot[0];
        for (int i = 1; i < slot.length; i++) {
            if (slot[i] > maxColumn) {
                maxColumn = slot[i];
            }
        }
        for (int i = maxColumn; i > 0; i--) {
            for (int j = 1; j < slot.length; j++) {
                if (slot[j] == i) {
                    System.out.print("0");
                    slot[j]--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < slot.length; i++) {
            System.out.print("_");
        }
    }
}