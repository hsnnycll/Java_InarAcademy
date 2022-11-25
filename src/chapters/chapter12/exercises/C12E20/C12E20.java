package chapters.chapter12.exercises.C12E20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class C12E20 {
    public static void main(String[] args) throws NoSuchElementException, FileNotFoundException {

        if (args.length != 1) {
            System.out.println("Usage: java C12E20 directoryname");
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

        File[] mainFiles = mainDirectory.listFiles();
        if (mainFiles == null) {
            System.out.println(mainDirectory + " is empty");
            System.exit(3);
        }

        ArrayList<File> directories = new ArrayList<>();
        for (int i = 0; i < mainFiles.length; i++) {
            if (mainFiles[i].isDirectory() && mainFiles[i].getName().contains("chapter")) {
                directories.add(mainFiles[i]);
            }
        }

        if (directories.isEmpty()) {
            System.out.println("There is no directory in " + mainDirectory);
            System.exit(4);
        }

        for (File i : directories) {
            File[] files = i.listFiles();
            for (int j = 0; j < files.length; j++) {
                if (files[j].isFile() && files[j].getName().contains(".java")) {
                    removeFirstLine(files[j]);
                }
            }
        }
    }

    public static void removeFirstLine(File file) throws FileNotFoundException, NoSuchElementException {
        try (
                Scanner input = new Scanner(file);
        ) {
            String removedStr = "package " + file.getParent() + "." + file.getName();
            String str = "";
            String writeStr = "";
            while (input.hasNext()) {
                str = input.nextLine();
                if(str.contains(removedStr)){
                    continue;
                }
                writeStr += str;
            }
            PrintWriter output = new PrintWriter(file);
            output.println(writeStr);
            output.close();
        }
    }
}
