package chapters.chapter12.exercises.C12E04;

public class ModifiedLoan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public ModifiedLoan() {
        this(2.5, 1, 1000);
    }

    public ModifiedLoan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Invalid input: must be greater than 0");
        }
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Invalid input: must be greater than 0");
        }
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Invalid input: must be greater than 0");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Invalid input: must be greater than 0");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Invalid input: must be greater than 0");
        }
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Invalid input: must be greater than 0");
        }
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }
}

