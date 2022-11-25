package chapters.chapter12.exercises.C12E16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C12E16 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 3) {
            System.out.println("Usage: java ReplaceText File oldString newString");
            System.exit(0);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }

        String str1 = args[1];
        String str2 = args[2];
        String s1;
        StringBuilder s2 = new StringBuilder();
        Scanner input = new Scanner(sourceFile);
        while (input.hasNext()) {
            s1 = input.nextLine();
            s2.append(s1.replaceAll(str1, str2));
        }
        input.close();
        PrintWriter output = new PrintWriter(sourceFile);
        output.print(s2);
        output.close();
    }
}
