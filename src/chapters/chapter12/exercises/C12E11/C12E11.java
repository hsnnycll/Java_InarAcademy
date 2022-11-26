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

        StringBuilder str2 = new StringBuilder();
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                String str = input.nextLine();
                str2.append(str.replaceAll(args[0], " ") + "\n");
            }
            PrintWriter output = new PrintWriter(file);
            output.println(str2);
            output.close();
        }
    }
}
