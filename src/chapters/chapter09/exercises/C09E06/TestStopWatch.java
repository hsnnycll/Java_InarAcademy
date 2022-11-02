package chapters.chapter09.exercises.C09E06;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();

        Random random = new Random();
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }

        time.start();
        selectionSort(array);
        time.stop();
        System.out.println("Execution time of sorting 100,000 numbers using selection sort is " + time.getElapsedTime() / 1000 + " seconds.");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
