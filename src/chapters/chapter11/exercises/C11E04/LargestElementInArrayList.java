package chapters.chapter11.exercises.C11E04;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestElementInArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of numbers (ending wtih 0): ");
        ArrayList<Integer> list = new ArrayList<>();
        int number;
        while ((number = input.nextInt()) != 0){
            list.add(number);
        }

        System.out.println("The largest number is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty() || list == null){
            return null;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }
}
