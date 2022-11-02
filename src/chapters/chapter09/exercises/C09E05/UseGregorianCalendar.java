package chapters.chapter09.exercises.C09E05;

import java.util.GregorianCalendar;

public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar time = new GregorianCalendar();
        System.out.println("Current date is " + time.get(GregorianCalendar.YEAR) + "." + time.get(GregorianCalendar.MONTH)
                + "." + time.get(GregorianCalendar.DAY_OF_MONTH));
        time.setTimeInMillis(1234567898765L);
        System.out.println("The date is " + time.get(GregorianCalendar.YEAR) + "." + time.get(GregorianCalendar.MONTH)
                + "." + time.get(GregorianCalendar.DAY_OF_MONTH));
    }
}