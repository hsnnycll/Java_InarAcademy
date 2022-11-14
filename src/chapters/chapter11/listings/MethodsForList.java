package chapters.chapter11.listings;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsForList {
    public static void main(String[] args) {

        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));

        String[] array1 = new String[list.size()];
        list.toArray(array1);

        Integer[] array2 = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        java.util.Collections.sort(list2);
        System.out.println(list2);
        System.out.println(java.util.Collections.max(list2));
        System.out.println(java.util.Collections.min(list2));
        java.util.Collections.shuffle(list2);
        System.out.println(list2);
    }
}
