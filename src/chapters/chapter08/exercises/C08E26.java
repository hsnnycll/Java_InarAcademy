package chapters.chapter08.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C08E26 {
    public static void main(String[] args) {

        double[][] array= createMatrix();
        double[][] sortedArray = sortArray(array);

        System.out.println("Original array is: ");
        displayArray(array);

        System.out.println("Sorted array is: ");
        displayArray(sortedArray);
    }
    public static double[][] createMatrix(){
        Scanner input = new Scanner(System.in);

        double[][] array = new double[3][3];
        System.out.println("Enter values: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }

    public static void copyArray(double[][] originalArray, double[][] copyArray){
        for (int row = 0; row < originalArray.length; row++) {
            for (int col = 0; col < originalArray[row].length; col++) {
                copyArray[row][col] = originalArray[row][col];
            }
        }
    }

    public static double[][] sortArray(double[][] originalArray){
        double[][] newArray = new double[originalArray.length][originalArray[0].length];
        copyArray(originalArray, newArray);

        for (int row = 0; row < newArray.length; row++) {
            for (int col = 0; col < newArray[row].length; col++) {
                double min = Double.MAX_VALUE;
                int index = -1;
                for (int i = col; i < newArray[row].length; i++) {
                    if(min > newArray[row][i]){
                        min = newArray[row][i];
                        index = i;
                    }
                }
                if(index != col){
                    newArray[row][index] = newArray[row][col];
                    newArray[row][col] = min;
                }
            }
        }
        return newArray;
    }

    public static void displayArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
