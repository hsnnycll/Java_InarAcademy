package chapters.chapter11.exercises.C11E11;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }
}
