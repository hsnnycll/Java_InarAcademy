package chapters.chapterArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        reverse(list);
    }

    public static void reverse(List list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add((Integer) list.get(i));
        }
        System.out.print(reversedList);
    }
}
