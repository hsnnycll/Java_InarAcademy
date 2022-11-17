package chapters.chapter11.exercises.C11E07;

import java.util.ArrayList;

public class ShuffleArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println(list);
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int)(Math.random() * list.size());
            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }
}
