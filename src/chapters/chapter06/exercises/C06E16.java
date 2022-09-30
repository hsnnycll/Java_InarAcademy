package chapters.chapter06.exercises;

public class C06E16 {
    public static void main(String[] args) {
        System.out.println("Year      Number of Days");
        System.out.println("-------------------------");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "          " + numberOfDaysInAYear(year));
        }
    }
    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return 366;
        else
            return 365;
    }
}
