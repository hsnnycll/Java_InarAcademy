package chapters.chapter12.exercises.C12E25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C12E25 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Salary.txt");
        if (!file.exists()){
            System.out.println("There is no a file with this name");
            System.exit(0);
        }

        int countAssi = 0;
        int countAsso = 0;
        int countFull = 0;
        double salAssi = 0;
        double salAsso = 0;
        double salFull = 0;
        try (
                Scanner input = new Scanner(file)
                ){
            while (input.hasNext()){
                String firstName = input.next();
                String lastName = input.next();
                String rank = input.next();
                if (rank.equals("assistant")){
                    countAssi++;
                    salAssi += input.nextDouble();
                } else if (rank.equals("associate")) {
                    countAsso++;
                    salAsso += input.nextDouble();
                }else {
                    countFull++;
                    salFull += input.nextDouble();
                }
            }
        }
        System.out.printf("Total salary of assistants is %.2f and average is %.2f", salAssi, salAssi / countAssi);
        System.out.printf("\nTotal salary of associates is %.2f and average is %.2f", salAsso, salAsso / countAsso);
        System.out.printf("\nTotal salary of full is %.2f and average is %.2f", salFull, salFull / countFull);
        System.out.printf("\nTotal salary of the faculty is %.2f", salAssi + salAsso + salFull);
        System.out.printf("\nTotal average is %.2f", (salAssi + salAsso + salFull) / (countAssi + countAsso + countFull));
    }
}
