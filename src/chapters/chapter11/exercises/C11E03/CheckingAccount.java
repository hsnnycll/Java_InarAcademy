package chapters.chapter11.exercises.C11E03;

public class CheckingAccount extends Account {

    private double limit;

    public CheckingAccount() {
        super();
        this.limit = 100;
    }

    public CheckingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withDraw(double amount) {
        if (getBalance() - amount > limit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("You cannot withdraw this amount!");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nLimit is: $" + this.limit;
    }
}
