package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        System.out.println("Enter annual interest rate in percentage: ");
        System.out.println("Enter number of years: ");
        double investmentAmount = input.nextDouble();
        double annualInterestRate = input.nextDouble();
        int years = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
System.out.println("Years      Future Value");
        for (int i = 1; i <= years; i++) {
            System.out.print(i);
            System.out.printf("\t\t\t%.2f", futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
            System.out.println();
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthyInterestRate), years * 12);
    }
}
