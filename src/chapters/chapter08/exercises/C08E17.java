package chapters.chapter08.exercises;

import java.util.Scanner;

public class C08E17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of banks: ");
        int numberOfBanks = input.nextInt();
        System.out.print("Enter the limit: ");
        double limit = input.nextDouble();

        double[][] borrowers = new double[numberOfBanks][numberOfBanks];
        double[] balance = new double[numberOfBanks];
        double[] assets = new double[numberOfBanks];

        processInputs(borrowers, balance);
        processAssetsArray(borrowers, balance, assets);
        printUnsafeBanks(borrowers, assets, limit);
    }

    public static void processInputs(double[][] borrowers, double[] balance){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < balance.length; i++) {
            System.out.print("Enter the balance for bank " + i + " : ");
            balance[i] = input.nextDouble();
            System.out.print("Enter the number of borrowers: ");
            for (int numberOfBorrowers = input.nextInt(); numberOfBorrowers > 0; numberOfBorrowers--) {
                int count = 0;
                int j;
                do {
                    System.out.print("Enter Bank ID " + ((count > 0) ? " again:" : ":"));
                    j = input.nextInt();
                    count++;
                }while (j == i);
                System.out.print("Enter the amount borrowed: ");
                borrowers[i][j] = input.nextDouble();
            }
        }
    }

    public static void processAssetsArray(double[][] borrowers, double[] balance, double[] assets){
        for (int i = 0; i < balance.length; i++) {
            assets[i] += balance[i];
            for (int j = 0; j < balance.length; j++) {
                if (i != j){
                    assets[i] += borrowers[i][j];
                }
            }
        }
    }

    public static void printUnsafeBanks(double[][] borrowers, double[] assets, double limit){
        boolean[] isCheckedBanks = new boolean[assets.length];
        for (int i = 0; i < assets.length; i++) {
            if (assets[i] < limit && !isCheckedBanks[i]){
                for (int j = 0; j < assets.length; j++) {
                    if (j != i){
                        assets[j] -= borrowers[j][i];
                        isCheckedBanks[i] = true;
                        i = 0;
                    }
                }
            }
        }
        System.out.print("\n\nUnsafe banks are: ");
        for (int i = 0; i < assets.length; i++) {
            if (isCheckedBanks[i] == true){
                System.out.print(i + " ");
            }
        }
    }
}
