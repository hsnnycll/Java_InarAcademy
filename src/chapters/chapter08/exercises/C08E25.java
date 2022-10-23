package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3x3 matrix row by row: ");
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = input.nextDouble();
            }
        }
        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix.");
        } else {
            System.out.println("It is not a Markov matrix.");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m.length; c++) {
                if (m[r][c] < 0) {
                    return false;
                }
            }
        }
        for (int c = 0; c < m.length; c++) {
            double sumCol = 0;
            for (int r = 0; r < m.length; r++) {
                sumCol += m[r][c];
            }if(sumCol != 1.0){
                return false;
            }
        }
        return true;
    }
}