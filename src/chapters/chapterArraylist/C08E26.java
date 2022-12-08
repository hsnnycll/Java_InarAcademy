package chapters.chapterArraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C08E26 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Double>> list = createArrayList();

        System.out.println("Original list is: " + list);
        for (int i = 0; i < list.size(); i++) {
            Collections.sort(list.get(i));
        }
        System.out.println("Sorted list is: " + list);

    }

    public static ArrayList<ArrayList<Double>> createArrayList() {
        Scanner input = new Scanner(System.in);

        ArrayList<ArrayList<Double>> list = new ArrayList<>();
        System.out.println("Enter your array size(nxn): ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            list.add(new ArrayList<Double>());
        }
        System.out.println("Enter values for: ");
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                list.get(row).add(col, input.nextDouble());
            }
        }
        return list;
    }
}
