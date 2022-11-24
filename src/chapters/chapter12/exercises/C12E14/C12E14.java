package chapters.chapter12.exercises.C12E14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C12E14 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.out.println("Usage: java C12E14 Filename");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }

        double total =0;
        int count =0;
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()){
                total += input.nextInt();
                count++;
            }
        }
        System.out.println("The total of numbers is " + total + " and their average " + total / count);
    }
}
