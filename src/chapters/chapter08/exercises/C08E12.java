package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};

        System.out.println("Enter the filing status: ");
        int status = input.nextInt();
        System.out.println("Enter the taxable income: ");
        int income = input.nextInt();
        int incomePlace = findIncomePlace(brackets, income, status);

        double tax = 0;
        if (incomePlace == 0){
            tax = income * rates[0];
        }else {
            for (int i = 0; i <= incomePlace; i++) {
                if(i == 0){
                    tax += brackets[status][i] * rates[i];
                } else if (i == 5) {
                    tax += (income - brackets[status][i - 1] * rates[i]);
                }else {
                    if (i == incomePlace){
                        tax += (income - brackets[status][i - 1]) * rates[i];
                    }else {
                        tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
                    }
                }
            }
            System.out.printf("Tax is %.1f", tax);
        }
    }

    public static int findIncomePlace(int[][] brackets, int income, int status){
        for (int i = brackets[status].length - 1; i > 0; i--) {
            if (income < brackets[status][i]){
                return i;
            }
        }
        return 5;
    }
}
