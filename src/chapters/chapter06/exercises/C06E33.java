package chapters.chapter06.exercises;

public class C06E33 {
    public static void main(String[] args) {
        showCurretnTime();
        showCurrentDate();
    }

    public static void showCurretnTime() {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        System.out.println("Current time is " + (currentHours + 3) + ":"
                + currentMinute + ":" + currentSecond);
    }

    public static void showCurrentDate() {
        long totalmilliseconds = System.currentTimeMillis();

        long totalSeconds = totalmilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long totaldays = totalHours / 24;

        System.out.println("Current date is " + year((int) totaldays));
    }

    public static int year(int totalDays) {
        int year = 1970;
        while (totalDays > 365) {
            totalDays -= numberOfDaysInAYear(year);
            year++;
        }
        return year;
    }

    public static int numberOfDaysInAYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
