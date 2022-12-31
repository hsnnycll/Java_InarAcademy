package chapters.chapterMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C07E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer between 1 and 100: ");
        Map<Integer, Integer> map = new HashMap<>();
        int i;
        while ((i = input.nextInt()) != 0) {
            if (map.containsKey(i)) {
                int number = map.get(i);
                map.put(i, number + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(Arrays.toString(map.keySet().toArray()));
        System.out.println(Arrays.toString(map.values().toArray()));
    }
}
