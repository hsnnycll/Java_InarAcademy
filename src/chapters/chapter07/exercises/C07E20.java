package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        selectionSort(numbers);
        for (double a : numbers) {
            System.out.print(a + " ");
        }
    }

    public static void selectionSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] < array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
