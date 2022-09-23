package chapters.chapter05.exercises;

import java.util.Scanner;

public class C05E42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your commission sought : ");

        double commissionSought = input.nextInt();
        double baseSalary = 5000;

        double firstComRate = baseSalary * 0.08;
        double secondComRate = baseSalary * 0.10;
        commissionSought = commissionSought - (firstComRate + secondComRate);

        double count;
        for (count = 0; count < commissionSought; count += 0.01) {

            if (count * 0.12 > commissionSought) {
            }
        }
        System.out.println("Your sales amount is  "+  count);
    }
}
