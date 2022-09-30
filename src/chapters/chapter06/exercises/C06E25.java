package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter milliseconds: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis){
        long seconds = millis / 1000;
        long currentSeconds = seconds % 60;
        long minutes = seconds / 60;
        long currentMinutes = minutes % 60;
        long hours = minutes / 60;
        return hours + ":" + currentMinutes + ":" + currentSeconds;
    }
}
