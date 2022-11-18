package chapters.chapter11.exercises.C11E08;

public class Test {
    public static void main(String[] args) {

        Account account = new Account(1122, 1000, "George");
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        System.out.println(account);
    }
}
