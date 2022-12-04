package weeks.week_17;

import java.util.*;

public class MySet {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        fillListRandomly(list);
        printList(list);
        printUniqueNumbers(list);
    }

    public static void fillListRandomly(List list){
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random() * 10));
        }
    }

    public static void printList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static void printUniqueNumbers(List list){
        Set<Integer> set = new HashSet<>();
        for (Object i:list) {
            set.add((Integer) i);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
}
