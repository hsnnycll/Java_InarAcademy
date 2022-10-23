package chapters.chapter07.exercises;

import java.util.Arrays;

public class C07E22 {
    public static void main(String[] args) {
        int[] table = new int[8];
        int row = 0;
        int count = 0;
        while (row < table.length) {
            count++;
            if (isThereAPlaceToPutAQuen(table, row)) {
                putQueen(table, row);
                row++;
            } else {
                row = 0;
            }
        }
        displayTable(table, count);
    }

    public static boolean isThereAPlaceToPutAQuen(int[] table, int row) {
        boolean[] checkTable = new boolean[8];
        Arrays.fill(checkTable, true);
        for (int i = 0; i < row; i++) {
            checkTable[table[i]] = false;
            if ((table[i] + row - i) < 8) {
                checkTable[row - i + table[i]] = false;
            }
            if ((table[i] - (row - i)) > 0) {
                checkTable[table[i] - (row - i)] = false;
            }
        }
        for (int i = 0; i < checkTable.length; i++) {
            if (checkTable[i]) {
                return true;
            }
        }
        return false;
    }

    public static void putQueen(int[] table, int row){
        int queensPlace;
        while (true){
            queensPlace = (int)(Math.random() * 8);
            if (isPlaceAvaible(table, queensPlace, row)){
                break;
            }
        }
        table[row] = queensPlace;
    }

    public static boolean isPlaceAvaible(int[] table, int queensPlace, int row){
        boolean[] checkSuitable = new boolean[8];
        Arrays.fill(checkSuitable, true);
        for (int i = 0; i < row; i++) {
            checkSuitable[table[i]] = false;
            if ((row - i + table[i]) < 8){
                checkSuitable[row - i + table[i]] = false;
            }
            if (table[i] - (row - i) > 0){
                checkSuitable[table[i] - (row - i)] = false;
            }
        }
        return checkSuitable[queensPlace];
    }

    public static void displayTable(int[] table, int count){
        System.out.println("It takes " + count + " times");
        for (int i = 0; i < table.length; i++) {
            System.out.print("|");
            for (int j = 0; j < table[i]; j++) {
                System.out.print(" |");
            }
            System.out.print("Q| ");
            for (int j = table[i] + 1; j < table.length; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }
    }
}
