package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the first day of the year (i.e. for Tuesday enter 2): ");
        int day = input.nextInt();

        String monthName = "";
        String dayName = "";
        int lastDay = 0;
        for (int month = 1; month <= 12; month++){
            switch (month){
                case 1: monthName = "January";
                lastDay = 31;
                break;
                case 2: monthName = "February";
                day = (day + 31) % 7;
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    lastDay = 29;
                }else
                    lastDay = 28;
                break;
                case 3: monthName = "March";
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        day = (day + 29) % 7;
                    }else
                        day = (day + 28) % 7;
                    lastDay = 31;
                    break;
                case 4: monthName = "April";
                day = (day + 31) % 7;
                lastDay = 30;
                break;
                case 5: monthName = "May";
                day = (day + 30) % 7;
                lastDay = 31;
                break;
                case 6: monthName = "June";
                day = (day + 31) % 7;
                lastDay = 30;
                break;
                case 7: monthName = "July";
                day = (day + 30) % 7;
                lastDay = 31;
                break;
                case 8: monthName = "August";
                day = (day + 31) % 7;
                lastDay = 31;
                break;
                case 9: monthName = "September";
                day = (day + 31) % 7;
                lastDay = 30;
                break;
                case 10: monthName = "October";
                day = (day + 30) % 7;
                lastDay = 31;
                break;
                case 11: monthName = "November";
                day = (day + 31) % 7;
                lastDay = 30;
                break;
                case 12: monthName = "December";
                day = (day + 30) % 7;
                lastDay = 31;
                break;
            }
            System.out.printf("%16s%d\n" ,monthName , year);

            for (int i = 0; i < 30; i++) {
                System.out.print("-");
            }

            System.out.println();
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

            for (int j = 0; j < day; j++) {
                System.out.print("   \t");
            }

            for (int k = 1; k <= lastDay; k++) {
                System.out.printf("%-3d\t" , k);
                if ((day + k) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
