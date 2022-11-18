package chapters.chapter11.exercises.C11E08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        dateCreated = new Date();
        transactions = new ArrayList<>();
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

    public void withdraw(double withdraw){
        this.balance = balance - withdraw;
        Transaction transaction = new Transaction('W', withdraw, this.balance, "Withdraw");
        transactions.add(transaction);
    }

    public void deposit(double deposit){
        this.balance = balance + deposit;
        Transaction transaction = new Transaction('D', deposit, this.balance, "Deposit");
        transactions.add(transaction);
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    @Override
    public String toString(){
        return "Account Summary: " + "\nName: " + this.name + "\nMonthly Interest Rate: " + getMonthlyInterest()
                + "\nBalance: " + this.balance + "\nDate: " + this.dateCreated + "\nTransactions: "
                + Arrays.toString(transactions.toArray());
    }
}
