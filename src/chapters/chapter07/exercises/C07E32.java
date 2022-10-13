package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list : ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        partition(list);
        System.out.print("After the partition, the list is ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int indexPivot = 0;
        int lastIndex = list.length - 1;
        while (indexPivot < lastIndex) {
            if (list[indexPivot + 1] < pivot) {
                int temp = list[indexPivot + 1];
                list[indexPivot + 1] = list[indexPivot];
                list[indexPivot] = temp;
                indexPivot++;
            } else {
                int temp = list[lastIndex];
                list[lastIndex] = list[indexPivot + 1];
                list[indexPivot + 1] = temp;
                lastIndex--;
            }
        }
        return indexPivot;
    }
}
