package chapters.chapter12.exercises.C12E24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class C12E24 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("There is a file with this name already");
            System.exit(0);
        }

        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 1; i <= 1000; i++) {
                String rank = getRank();
                String salary = String.format("%.2f", getSalary(rank));
                output.println("FirstName" + i + " LastName" + i + " " + rank + " " + salary);
            }
        }
    }

    public static String getRank() {
        String[] ranks = {"assistant", "associate", "full"};
        String rank = ranks[(int) (Math.random() * ranks.length)];
        return rank;
    }

    public static double getSalary(String rank) {
        if (rank.equals("assistant")) {
            return Math.random() * (80_000 - 50_000);
        } else if (rank.equals("associate")) {
            return Math.random() * (110_000 - 60_000);
        } else {
            return Math.random() * (130_000 - 75_000);
        }
    }
}
