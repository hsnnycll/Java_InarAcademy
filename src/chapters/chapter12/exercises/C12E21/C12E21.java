package chapters.chapter12.exercises.C12E21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C12E21 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner("SortedStrings.txt")
        ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
        }
        if(isSorted(list) == -1){
            System.out.println("The strings are sorted in the file.");
        }else{
            System.out.println("The strings are not sorted, the first two strings that are out of order:" +
                    list.get(isSorted(list)) + " " + list.get(isSorted(list) + 1));
        }
    }

    public static int isSorted(ArrayList<String> list){
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0){
                return i;
            }
        }
        return -1;
    }
}
