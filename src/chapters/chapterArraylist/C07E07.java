package chapters.chapterArraylist;

import java.util.ArrayList;

public class C07E07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 10));
        }
        int[] counts = new int[10];
        for (int i = 0; i < list.size(); i++) {
            counts[list.get(i)]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " : " + counts[i]);
        }
    }
}
