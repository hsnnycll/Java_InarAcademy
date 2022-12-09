package chapters.chapterSet;

import java.util.*;

public class C07E05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        set.addAll(list);
        System.out.println("Distinct numbers are: ");
        for (Integer i:set) {
            System.out.print(i + " ");
        }
    }
}
