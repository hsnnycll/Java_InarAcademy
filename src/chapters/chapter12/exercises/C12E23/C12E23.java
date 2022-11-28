package chapters.chapter12.exercises.C12E23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class C12E23 {
    public static void main(String[] args) {

        String URLString = "http://cs.armstrong.edu/liang/data/Scores.txt";
        URL url = null;
        try{
            url = new URL(URLString);
        } catch (MalformedURLException e) {
            System.out.println("Invalid url");
        }

        try (
                Scanner input = new Scanner(url.openStream())
        ) {
           int count = 0;
           int total = 0;
           while (input.hasNext()){
               total += input.nextInt();
               count++;
           }
            System.out.println("The total of the scores: " + total);
            System.out.println("The average oof the scores: " + total / count);
        }
        catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
