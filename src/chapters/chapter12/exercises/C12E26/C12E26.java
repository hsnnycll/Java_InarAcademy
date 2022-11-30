package chapters.chapter12.exercises.C12E26;

import java.io.File;
import java.util.Scanner;

public class C12E26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a directory name: ");
        File directory = new File(input.nextLine());
        if (directory.exists()){
            System.out.println("Directory already exists");
        } else {
            directory.mkdirs();
            System.out.println("Directory created successfully");
        }
    }
}
