package chapters.chapter11.exercises.C11E12;

import java.util.ArrayList;
import java.util.Scanner;

public class SumArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        System.out.println(list);
        double sumNumbers = sum(list);
        System.out.println("The sum of the numbers is " + sumNumbers);
    }

    private static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
