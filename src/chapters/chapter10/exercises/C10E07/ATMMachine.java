package chapters.chapter10.exercises.C10E07;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            int id = getId();
            while (true) {
                displayMenu();
                int choice = getChoice();
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                } else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw : ");
                    double withdraw = input.nextDouble();
                    if (withdraw <= accounts[id].getBalance()) {
                        accounts[id].withdraw(withdraw);
                    } else {
                        System.out.print("You don't have that much money.");
                        System.out.println("Your maximum withdraw amount can be " + accounts[id].getBalance());
                    }
                } else if (choice == 3) {
                    System.out.print("Enter the amount to deposit: ");
                    double deposit = input.nextDouble();
                    accounts[id].deposit(deposit);
                } else {
                    break;
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }

    public static int getId() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an id: ");
        int id = input.nextInt();
        if (0 > id || id > 9) {
            do {
                System.out.print("Enter a correct id: ");
                id = input.nextInt();
            } while (0 > id || id > 9);
        }
        return id;
    }

    public static int getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a choice: ");
        int choice = input.nextInt();
        if (1 > choice || choice > 4) {
            do {
                System.out.print("Enter a correct choice: ");
                choice = input.nextInt();
            } while (1 > choice || choice > 4);
        }
        return choice;
    }
}
