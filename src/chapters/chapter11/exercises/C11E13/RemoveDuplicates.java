package chapters.chapter11.exercises.C11E13;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integer numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        removeDuplicate(list);
        System.out.print("The distinct integers are: ");
        for (Integer i: list) {
            System.out.print(i + " ");
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> removed = new ArrayList<>();
        while (!list.isEmpty()){
            int n = list.remove(0);
            if (!removed.contains(n)){
                removed.add(n);
            }
        }
        list.addAll(removed);
    }
}
