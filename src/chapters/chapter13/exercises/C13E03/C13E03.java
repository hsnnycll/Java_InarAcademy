package chapters.chapter13.exercises.C13E03;

import java.util.ArrayList;

public class C13E03 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 1000);
            list.add(number);
        }
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(j).doubleValue() < list.get(i).doubleValue()) {
                    Number temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
