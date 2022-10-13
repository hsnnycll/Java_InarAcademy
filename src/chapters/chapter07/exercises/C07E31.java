package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class C07E31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1 (the first number will be the length of the list): ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list2 (the first number will be the length of the list): ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        int[] merge = merge(list1, list2);
        System.out.print("The merged list is ");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merge = new int[list1.length + list2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < merge.length; i++) {
            if (k < list2.length && list1[j] > list2[k]) {
                merge[i] = list2[k];
                k++;
            } else if (j < list1.length) {
                merge[i] = list1[j];
                j++;
            }
        }
        return merge;
    }
}
