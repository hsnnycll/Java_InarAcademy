package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = input.nextInt();
        String[] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.println(animals[year % 12]);
    }
}
