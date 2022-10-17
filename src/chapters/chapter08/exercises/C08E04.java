package chapters.chapter08.exercises;

public class C08E04 {
    public static void main(String[] args) {

        int[][] worksHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}};

        int[] sumWorks = new int[8];
        for (int row = 0; row < worksHours.length; row++) {
            int sum = 0;
            for (int column = 0; column < worksHours[row].length; column++) {
                sum = worksHours[row][column];
            }
            sumWorks[row] = sum;
        }
        sort(sumWorks);
        for (int i = 0; i < sumWorks.length; i++) {
            System.out.println("Employee " + i + " working in a week " + sumWorks[i] + " hours.");
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

