package chapters.chapter11.exercises.C11E14;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        getList(list1);
        getList(list2);

        ArrayList<Integer> combinedList = union(list1, list2);
        System.out.print("The combined list is ");
        for (Integer i: combinedList) {
            System.out.print(i + " ");
        }

    }

    public static void getList(ArrayList<Integer> list){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five integers for list: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> combinedList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            combinedList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            combinedList.add(list2.get(i));
        }
        return combinedList;
    }
}
