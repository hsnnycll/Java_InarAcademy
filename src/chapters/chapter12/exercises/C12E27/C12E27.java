package chapters.chapter12.exercises.C12E27;

import java.io.File;

public class C12E27 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java C12E27 directoryName");
            System.exit(0);
        }

        File directory = new File(args[0]);
        if (!directory.exists()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(1);
        }
        if (!directory.isDirectory()) {
            System.out.println(directory + " is not a directory");
            System.exit(2);
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println(directory + " is empty");
            System.exit(3);
        }

        for (File file : files) {
            if (file.getName().matches("Exercise[\\d]_[\\d].*")) {
                StringBuilder name = new StringBuilder(file.getName());
                name.insert(8, "0");
                name.insert(11, "0");
                file.renameTo(new File(String.valueOf(name)));
            }
        }
    }
}
