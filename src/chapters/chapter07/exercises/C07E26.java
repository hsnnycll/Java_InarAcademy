package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your list1 length and list1: ");
        int length1 = input.nextInt();
        int[] list1 = new int[length1];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter your list2 length and list2: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (length1 != length2){
            System.out.println("Two list are not strictly identical.");
        }
        if (equals(list1, list2)){
            System.out.println("Two list are strictly identical.");
        }else {
            System.out.println("Two list are not strictly identical.");
        }

    }

    public static boolean equals (int[] list1, int[] list2){
        for (int i = 0; i < list1.length; i++) {
            if(list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
