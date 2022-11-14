package chapters.chapter11.listings;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers (input ends with 0): ");

        while (true){
            Integer number = input.nextInt();
            if (number == 0){
                break;
            }
            if (!list.contains(number)){
                list.add(number);
            }
        }
        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
