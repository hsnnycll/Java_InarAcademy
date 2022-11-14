package chapters.chapter11.exercises;

import chapters.chapter06.listings.PrintCalendar;

public class Test {
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
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;

        System.out.print("Current date is ");
        displayDate(totalDays);

    }
    public static void displayDate(long totalDays){
        final int YEAR = 1970;
        int cDay = 1;
        int cMonth = 1;
        int cYear = YEAR;
        for (int day = 1; day <= totalDays; day++){
            if (cDay < PrintCalendar.getNumberOfDaysInMonth(cYear, cMonth)){
                cDay++;
            } else if (cMonth < 12) {
                cMonth++;
                cDay = 1;
            }else {
                cYear++;
                cMonth = 1;
                cDay = 1;
            }
        }
        String month = PrintCalendar.getMonthName(cMonth);
        System.out.print(month + " " + cDay + " " + cYear);
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
