package chapters.chapter08.exercises;

public class C08E10 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        fillTheArrayRandomly(matrix);
        printArray(matrix);
        largestRow(matrix);
        largestColumn(matrix);
    }

    public static void fillTheArrayRandomly(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 2);
            }
        }
    }

    public static void printArray(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
               System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static void largestRow(int[][] matrix){
        int maxRow = Integer.MIN_VALUE;
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
        System.out.println("The largest row index: " + indexOfMaxRow);
    }

    public static void largestColumn(int[][] matrix){
        int maxColumn = Integer.MIN_VALUE;
        int indexOfMaxColumn = -1;
        for (int column = 0; column < matrix.length; column++) {
            int total = 0;
            for (int row = 0; row < matrix[column].length; row++) {
                total += matrix[row][column];
            }
            if (total > maxColumn) {
                maxColumn = total;
                indexOfMaxColumn = column;
            }
        }
        System.out.println("The largest column index: " + indexOfMaxColumn);
    }
}
