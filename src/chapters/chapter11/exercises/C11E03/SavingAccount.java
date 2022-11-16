package chapters.chapter11.exercises.C11E03;

public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() > amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("This account cannot permit withdraw from limit!");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
