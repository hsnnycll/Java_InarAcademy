package weeks.week_17;

import java.util.*;

public class MyArraylist {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(41);
        list.add(4);
        list.add(55);
        findMin(list);
        findMinIndex(list);
    }

    public static void findMin(List list){
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            if ((int)list.get(i) < min){
                min = (int) list.get(i);
            }
        }
        System.out.println("The minimum value of List is " + min);
    }

    public static void findMinIndex(List list){
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 1; i < list.size(); i++) {
            if ((int)list.get(i) < min){
                min = (int) list.get(i);
                minIndex = i;
            }
        }
        System.out.println("The index of minimum value of List is " + minIndex);
    }
}
