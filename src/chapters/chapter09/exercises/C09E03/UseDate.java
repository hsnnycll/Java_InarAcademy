package chapters.chapter09.exercises.C09E03;

import java.util.Date;

public class UseDate {
    public static void main(String[] args) {
        Date date = new Date();

        for (long i = 10000; i <= 100_000_000_000L; i *= 10) {
            date = new Date(i);
            System.out.println("For elapsed time " + i + " the time is " + date.toString());
        }
    }
}
