package chapters.chapter12.exercises.C12E19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class C12E19 {
    public static void main(String[] args) {

        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] word = line.split(" ");
                count += word.length;
            }
            System.out.println("The file has " + count + " words");
        }
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
