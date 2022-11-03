package chapters.chapter09.exercises.C09E13;

import java.util.Date;
import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {

        double[][] matrix = getMatrix();

        Location location = locateLargest(matrix);
        System.out.println(location);
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];

        System.out.println("Enter the array: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }

    public static Location locateLargest(double[][] a){
        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(maxValue < a[i][j]){
                    maxValue = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        Location location = new Location(row, col, maxValue);
        return location;
    }
}
