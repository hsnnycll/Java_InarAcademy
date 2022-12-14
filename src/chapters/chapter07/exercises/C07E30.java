package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        int[] list = createArray(numberOfValues);

        if (isConsecutiveFour(list)) {
            System.out.println("The list has consecutive fours");
        } else
            System.out.println("The list has no consecutive fours");
    }

    public static int[] createArray(int size) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values: ");
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextInt();
        }
        return result;
    }

    public static boolean isConsecutiveFour(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
                if (count == 4) {
            return true;
        }
            } else
                count = 1;
        }
        
        return false;
    }
}
