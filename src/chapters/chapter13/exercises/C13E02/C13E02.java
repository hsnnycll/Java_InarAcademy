package chapters.chapter13.exercises.C13E02;

import java.util.ArrayList;

public class C13E02 {
    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            Number n1 = list.get(i);
            Number n2 = list.get(randomIndex);
            list.set(i, n2);
            list.set(randomIndex, n1);
        }
    }
}
