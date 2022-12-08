package chapters.chapterArraylist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C20E01 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.out.println("Usage: java C20E01 Filename.java");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }

        ArrayList<String> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.next());
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
