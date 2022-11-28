package chapters.chapter12.exercises.C12E22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C12E22 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java C12E22 directoryName oldString newString");
            System.exit(0);
        }

        File mainDirectory = new File(args[0]);
        if (!mainDirectory.exists()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(1);
        }
        if (!mainDirectory.isDirectory()) {
            System.out.println(mainDirectory + " is not a directory");
            System.exit(2);
        }

        File[] allfiles = mainDirectory.listFiles();
        if (allfiles == null) {
            System.out.println(mainDirectory + " is empty");
            System.exit(3);
        }
        String oldStr = args[1];
        String newStr = args[2];
        for (File file : allfiles) {
            changeString(file, oldStr, newStr);

        }
    }

    public static void changeString(File file, String oldStr, String newStr) throws FileNotFoundException {
        String s1;
        StringBuilder s2 = new StringBuilder();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            s1 = input.nextLine();
            s2.append(s1.replaceAll(oldStr, newStr));
        }
        input.close();
        PrintWriter output = new PrintWriter(file);
        output.print(s2);
        output.close();
    }
}
