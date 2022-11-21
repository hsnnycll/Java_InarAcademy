package chapters.chapter12.exercises.C12E03;

import java.util.Scanner;

public class C12E03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
        System.out.print("Enter the index of the array: ");
        try {
            int index = input.nextInt();
            System.out.println(array[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Out Of Bounds");
            System.exit(1);
        }
    }
}
