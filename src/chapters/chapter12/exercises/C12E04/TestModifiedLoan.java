package chapters.chapter12.exercises.C12E04;

import java.util.Scanner;

public class TestModifiedLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter annual interest rate, for example, 8.25: ");
                double annualInterestRate = input.nextDouble();

                System.out.print("Enter number of years as an integer: ");
                int numberOfYears = input.nextInt();

                System.out.print("Enter loan amount, for example, 120000.95: ");
                double loanAmount = input.nextDouble();

                ModifiedLoan loan = new ModifiedLoan(annualInterestRate, numberOfYears, loanAmount);
                System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
                        loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                input.nextLine();
            }
        }
    }
}
