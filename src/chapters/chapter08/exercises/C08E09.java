package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E09 {
    public static void main(String[] args) {

        char[][] board = {{' ', ' ', ' ',},
                {' ', ' ', ' ',},
                {' ', ' ', ' ',}};
        printBoard(board);
        while (true) {
            playerX(board);
            printBoard(board);
            if (playerXWon(board)) {
                System.out.println("Player X won!");
                break;
            }
            if (isDraw(board)) {
                System.out.println("It is draw.");
                break;
            }
            playerO(board);
            printBoard(board);
            if (playerOWon(board)) {
                System.out.println("Player O won!");
                break;
            }
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        System.out.println("| " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " |");
        System.out.println("-------------");
    }

    public static void playerX(char[][] board) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, 2) for player X: ");
        System.out.println("Enter a column (0, 1, 2) for player X: ");
        int row = input.nextInt();
        int column = input.nextInt();
        if (board[row][column] == ' ') {
            board[row][column] = 'X';
        } else {
            do {
                System.out.println("Sorry this part is not empty! Try again:");
                row = input.nextInt();
                column = input.nextInt();
            } while (!(board[row][column] == ' '));
            board[row][column] = 'X';
        }
    }

    public static void playerO(char[][] board) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a row (0, 1, 2) for player O: ");
        System.out.println("Enter a column (0, 1, 2) for player O: ");
        int row = input.nextInt();
        int column = input.nextInt();
        if (board[row][column] == ' ') {
            board[row][column] = 'O';
        } else {
            do {
                System.out.println("Sorry this part is not empty! Try again:");
                row = input.nextInt();
                column = input.nextInt();
            } while (!(board[row][column] == ' '));
            board[row][column] = 'O';
        }
    }

    public static boolean playerOWon(char[][] board) {
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' ||
                board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' ||
                board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' ||
                board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||
                board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O' ||
                board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||
                board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            return true;
        }
        return false;
    }

    public static boolean playerXWon(char[][] board) {
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X' ||
                board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X' ||
                board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X' ||
                board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' ||
                board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X' ||
                board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X' ||
                board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X' ||
                board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            return true;
        }
        return false;
    }

    public static boolean isDraw(char[][] board) {
        if (board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' &&
                board[1][0] != ' ' && board[1][1] != ' ' && board[1][2] != ' ' &&
                board[2][0] != ' ' && board[2][1] != ' ' && board[2][2] != ' ') {
            return true;
        }
        return false;
    }
}
