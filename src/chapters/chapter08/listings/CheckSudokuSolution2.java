package chapters.chapter08.listings;

public class CheckSudokuSolution2 {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

        if (isValidSolution(sudoku)) {
            System.out.println("Valid Solution");
        } else {
            System.out.println("Invalid solution");
        }
    }

    public static boolean isValidSolution(int[][] sudoku) {
        if (checkNumbers(sudoku) == false) {
            return false;
        }

        if (checkLine(sudoku) == false) {
            return false;
        }

        if (checkColumn(sudoku) == false) {
            return false;
        }

        if (checkBox(sudoku) == false) {
            return false;
        }

        return true;
    }

    public static boolean checkNumbers(int[][] sudoku) {
        for (int row = 0; row < sudoku.length; row++) {
            for (int column = 0; column < sudoku.length; column++) {
                if (sudoku[row][column] < 1 || sudoku[row][column] > 9) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkLine(int[][] sudoku) {
        for (int row = 0; row < sudoku.length; row++) {
            boolean[] check = new boolean[9];
            for (int column = 0; column < sudoku.length; column++) {
                check[sudoku[row][column] - 1] = true;
            }
            for (boolean b : check) {
                if (b == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkColumn(int[][] sudoku) {
        for (int column = 0; column < sudoku.length; column++) {
            boolean[] check = new boolean[9];
            for (int row = 0; row < sudoku.length; row++) {
                check[sudoku[row][column] - 1] = true;
            }
            for (boolean b : check) {
                if (b == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkBox(int[][] sudoku) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] check = new boolean[9];
                for (int row = i * 3; row < i * 3 + 3; row++) {
                    for (int column = j * 3; column < j * 3 + 3; column++) {
                        check[sudoku[row][column] - 1] = true;
                    }
                }
                for (boolean b : check) {
                    if (b == false) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
