package chapters.chapter09.exercises.C09E07;

public class TestAccount {
    public static void main(String[] args) {

        Account account = new Account(1122, 20_000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);

        System.out.println("Balance: " + account.getBalance());
        System.out.println("The monthly interest: " + account.getMonthlyInterest());
        System.out.println("The date when this account was created: " + account.getDateCreated());
    }
}
