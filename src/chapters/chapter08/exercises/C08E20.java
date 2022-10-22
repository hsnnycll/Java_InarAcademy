package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E20 {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        printBoard(board);
        while (true) {
            playerRed(board);
            printBoard(board);
            if (playerRedWon(board)) {
                System.out.println("Player Red won!");
                break;
            }
            if (isDraw(board)) {
                System.out.println("It is draw.");
                break;
            }
            playerYellow(board);
            printBoard(board);
            if (playerYellowWon(board)) {
                System.out.println("Player Yellow won!");
                break;
            }
            if (isDraw(board)) {
                System.out.println("It is draw.");
                break;
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("|" + board[row][col]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void playerRed(char[][] board) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Drop a red disk at column (0–6): ");
            int col = input.nextInt();
            for (int row = board.length - 1; row >= 0; row--) {
                if (board[row][col] == ' ') {
                    board[row][col] = 'R';
                    break;
                }
                if (row == 0) {
                    System.out.println("Sorry, this column is not empty! You lost your turn:");
                }
            }
            break;
        }
    }

    public static void playerYellow(char[][] board) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Drop a yellow disk at column (0–6): ");
            int col = input.nextInt();
            for (int row = board.length - 1; row >= 0; row--) {
                if (board[row][col] == ' ') {
                    board[row][col] = 'Y';
                    break;
                }
                if (row == 0) {
                    System.out.println("Sorry, this column is not empty! You lost your turn:");
                }
            }
            break;
        }
    }

    public static boolean playerRedWon(char[][] board) {
        char red = 'R';
        if (isFourRow(board, red) || isFourCol(board, red) || isFourDiagonal(board, red) || isFourSubDiagonal(board, red)) {
            return true;
        }
        return false;
    }

    public static boolean playerYellowWon(char[][] board) {
        char yellow = 'Y';
        if (isFourRow(board, yellow) || isFourCol(board, yellow) || isFourDiagonal(board, yellow) || isFourSubDiagonal(board, yellow)) {
            return true;
        }
        return false;
    }

    public static boolean isDraw(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isFourRow(char[][] values, char color) {
        for (int row = 0; row < values.length; row++) {
            int count = 0;
            for (int col = 0; col < values[row].length - 1; col++) {
                if (values[row][col] == color) {
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
        }
        return false;
    }

    public static boolean isFourCol(char[][] values, char color) {
        for (int col = 0; col < values[0].length; col++) {
            int count = 0;
            for (int row = 0; row < values.length - 1; row++) {
                if (values[row][col] == color) {
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
        }
        return false;
    }

    public static boolean isFourDiagonal(char[][] values, char color) {
        for (int i = 0; i < values.length; i++) {
            int value = values[i][0];
                int count = 0;
                for (int row = i + 1, col = 1; row < values.length && col < values[0].length; row++, col++) {
                    if (value == values[row][col] && value == color) {
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
                    if (value == values[row][col] && value == color) {
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

    public static boolean isFourSubDiagonal(char[][] values, char color) {
        for (int i = 0; i < values[0].length; i++) {
            int value = values[0][i];
                int count = 0;
                for (int row = 1, col = i - 1; row < values.length && col >= 0; row++, col--) {
                    if (value == values[row][col] && value == color) {
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
                int count = 0;
                for (int row = i + 1, col = values[0].length - 2; row < values.length && col >= 0; row++, col--) {
                    if (value == values[row][col] && value == color) {
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
}
