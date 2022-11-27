package chapters.chapter12.exercises.C12E31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C12E31 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        String year = input.next();

        System.out.println("Enter gender: ");
        String gender = input.next();

        System.out.println("Enter name: ");
        String name = input.next();

        File file = new File("babynameranking" + year + ".txt");
        if (!file.exists()) {
            System.out.println("No record for " + year);
            System.exit(0);
        }

        int rank = getRank(gender, name, file);
        if (rank == -1){
            System.out.println("That name is not found");
        }else {
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        }
    }
    public static int getRank(String gender, String name, File file) throws FileNotFoundException {
        try (
                Scanner in = new Scanner(file);
        ) {
            while (in.hasNext()){
                int rank = in.nextInt();
                String maleBabyName = in.next();
                double maleBabyBirthRate = in.nextDouble();
                String femaleBabyName = in.next();
                double femaleBabyBirthRate = in.nextDouble();
                if ((name.equalsIgnoreCase(maleBabyName) && gender.equalsIgnoreCase("M")) ||
                        (name.equalsIgnoreCase(femaleBabyName) && gender.equalsIgnoreCase("F"))){
                    return rank;
                }
            }
        }
        return -1;
    }
}
