package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E19 {
    public static void main(String[] args) {

        int[][] array = createArray();
        if (isConsecutiveFour(array)) {
            System.out.println("The array has consecutive four numbers.");
        } else {
            System.out.println("The array hasn't any consecutive four numbers.");
        }

    }

    public static int[][] createArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter row and column length: ");
        int rowlength = input.nextInt();
        int columnlength = input.nextInt();

        int[][] array = new int[rowlength][columnlength];
        System.out.println("Enter values: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextInt();
            }
        }
        return array;
    }

    public static boolean isConsecutiveFour(int[][] values) {
        if (isConsecutiveRow(values) || isConsecutiveCol(values) || isConsecutiveDiagonal(values) || isConsecutiveSubDiagonal(values)) {
            return true;
        }
        return false;
    }

    public static boolean isConsecutiveRow(int[][] values) {
        for (int row = 0; row < values.length; row++) {
            int count = 0;
            for (int col = 0; col < values[row].length - 1; col++) {
                if (values[row][col] == values[row][col + 1]) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveCol(int[][] values) {
        for (int col = 0; col < values[0].length; col++) {
            int count = 0;
            for (int row = 0; row < values.length - 1; row++) {
                if (values[row][col] == values[row + 1][col]) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveDiagonal(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            int value = values[i][0];
            int count = 0;
            for (int row = i + 1, col = 1; row < values.length && col < values[0].length; row++, col++) {
                if (value == values[row][col]) {
                    count++;
                } else {
                    value = values[row][col];
                    count = 0;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        for (int i = 0; i < values[0].length; i++) {
            int value = values[0][i];
            int count = 0;
            for (int col = i + 1, row = 1; col < values[0].length && row < values.length; col++, row++) {
                if (value == values[row][col]) {
                    count++;
                } else {
                    value = values[row][col];
                    count = 0;
                }
                if (count == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveSubDiagonal(int[][] values) {
        for (int i = 0; i < values[0].length; i++) {
            int value = values[0][i];
            int count = 0;
            for (int row = 1, col = i - 1; row < values.length && col >= 0; row++, col--) {
                if (value == values[row][col]) {
                    count++;
                } else {
                    value = values[row][col];
                    count = 0;
                }
                if (count == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            int value = values[i][values[i].length - 1];
            int count = 1;
            for (int row = i + 1, col = values[0].length - 2; row < values.length && col >= 0; row++, col--) {
                if (value == values[row][col]) {
                    count++;
                } else {
                    value = values[row][col];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }
}
