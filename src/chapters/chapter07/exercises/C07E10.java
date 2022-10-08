package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("The index of the smallest element is: " + indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                index = i;
        }
        return index;
    }
}
