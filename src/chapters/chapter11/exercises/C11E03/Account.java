package chapters.chapter11.exercises.C11E03;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 12) / 100.0;
    }

    public void withDraw(double withdraw){
        this.balance = balance - withdraw;
    }

    public void deposit(double deposit){
        this.balance = balance + deposit;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    @Override
    public String toString(){
        return "\nAccount ID: " + this.id + "\nDate created: " + getDateCreated() + "\nBalance: $"
                + String.format("%.2f", this.balance) + "\nMonthly Interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}
