package chapters.chapter12.exercises.C12E15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C12E15 {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            int random;
            for (int i = 0; i < 100; i++) {
                random = (int) (Math.random() * 100);
                output.print(random + " ");
            }

        }

        try (
                Scanner input = new Scanner(file)
        ) {
            ArrayList<Integer> list = new ArrayList<>();
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
            sort(list);
            System.out.println(list);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
    }
}

