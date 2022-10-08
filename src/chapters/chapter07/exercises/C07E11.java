package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is: %.2f", mean(numbers));
        System.out.printf("\nThe standart deviation is: %.5f", deviation(numbers));
    }

    public static double mean(double[] array) {
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            mean = (sum / array.length);
        }
        return mean;
    }

    public static double deviation(double[] array) {
        double deviation = 0;
        double sumSqrt = 0;
        for (int i = 0; i < array.length; i++) {
            sumSqrt += Math.pow(array[i] - mean(array) , 2);
            deviation = Math.sqrt(sumSqrt / (array.length - 1));
        }
        return deviation;
    }
}
