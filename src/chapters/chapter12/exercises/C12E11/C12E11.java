package chapters.chapter12.exercises.C12E11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C12E11 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 2) {
            System.out.println("Usage: java C12E11 String filename");
            System.exit(0);
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("Source file " + args[1] + " does not exist");
            System.exit(1);
        }

        String remove = args[0];
        try (
                Scanner input = new Scanner(file);
                PrintWriter output = new PrintWriter(file);
        ) {
            while (input.hasNext()) {
                String str = input.nextLine();
                str.replaceAll(remove, "");
                output.println(str);
            }
        }
    }
}
