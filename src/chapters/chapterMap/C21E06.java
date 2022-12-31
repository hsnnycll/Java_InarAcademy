package chapters.chapterMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C21E06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
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
        int maxOc = Integer.MIN_VALUE;
        for (Integer value: map.values()) {
            if (value > maxOc){
                maxOc = value;
            }
        }
        for (Integer key: map.keySet()) {
            if (map.get(key) == maxOc){
                System.out.println("The " + key + " occurences " + maxOc + " times");
            }
        }
    }
}
