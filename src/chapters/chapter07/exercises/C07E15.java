package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        int[] eliminatedArray = eliminateDublicates(numbers);
        System.out.print("The distinct numbers are ");
        for (int i = 0; i < eliminatedArray.length; i++) {
            System.out.print(eliminatedArray[i] + " ");
        }
    }

    public static int[] eliminateDublicates(int[] list) {
        int[] newArray = new int[list.length];
        int indexForEliminated = 0;
        for (int i = 0; i < list.length; i++) {
            if (notDublicate(newArray, list[i])) {
                newArray[indexForEliminated] = list[i];
                indexForEliminated++;
            }
        }
        int[] eliminatedArray = new int[indexForEliminated];
        System.arraycopy(newArray, 0, eliminatedArray, 0, indexForEliminated);
        return eliminatedArray;
    }

    public static boolean notDublicate(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num)
                return false;
        }
        return true;
    }
}
