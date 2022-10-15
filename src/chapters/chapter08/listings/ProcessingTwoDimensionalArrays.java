package chapters.chapter08.listings;

public class ProcessingTwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        initializeWithRandomValues(matrix);

        printMatrix(matrix);

        int total = sumAllElements(matrix);
        System.out.println("The total value of the all elements of matrix is " + total);

        printTheSumOfTheColumns(matrix);

        printMaxRowAndIndexMaxRow(matrix);

        shuffleMatrix(matrix);

        printMatrix(matrix);
    }

    public static void initializeWithRandomValues(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }
    }

    public static int sumAllElements(int[][] matrix) {
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        return total;
    }

    public static void printTheSumOfTheColumns(int[][] matrix) {
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            System.out.println("Sum for column " + (column + 1) + " is " + total);
        }
    }

    public static void printMaxRowAndIndexMaxRow(int[][] matrix) {
        int maxRow = -1;
        int indexOfMaxRow = -1;
        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
            if (total > maxRow) {
                maxRow = total;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + (indexOfMaxRow + 1) + " has the maximum sum and max sum is " + maxRow);
    }

    public static void shuffleMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int randomRow = (int) (Math.random() * matrix.length);
                int randomColumn = (int) (Math.random() * matrix[row].length);

                int temp = matrix[row][column];
                matrix[row][column] = matrix[randomRow][randomColumn];
                matrix[randomRow][randomColumn] = temp;
            }
        }
    }
}
