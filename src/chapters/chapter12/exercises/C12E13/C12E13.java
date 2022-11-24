package chapters.chapter12.exercises.C12E13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C12E13 {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.out.println("Usage: java C12E13 Filename.java");
            System.exit(0);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(1);
        }

        int countLines = 0;
        int countWords = 0;
        int countChar = 0;
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String line = input.nextLine();
                countLines++;
                String[] word = line.split(" ");
                countWords += word.length;
                for (int i = 0; i < word.length; i++) {
                    countChar += word[i].length();
                }
            }
        }
        System.out.println("The number of characters: " + countChar);
        System.out.println("The number of word: " + countWords);
        System.out.println("The number of lines: " + countLines);
    }
}
