package chapters.chapter10.exercises.C10E08;

public class Tax {

    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    public int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}};

    public double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    private double taxableIncome;
    private double tax;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    private int findIncomePlace() {
        for (int i = this.brackets[filingStatus].length - 1; i > 0; i--) {
            if (taxableIncome < brackets[filingStatus][i]) {
                return i;
            }
        }
        return 5;
    }

    public double getTax() {
        int incomePlace = findIncomePlace();
        if (incomePlace == 0) {
            tax = taxableIncome * rates[0];
        } else {
            for (int i = 0; i < incomePlace; i++) {
                if (i == 0) {
                    tax += brackets[filingStatus][i] * rates[i];
                } else if (i == 5) {
                    tax += (taxableIncome - brackets[filingStatus][i - 1] * rates[i]);
                } else {
                    if (i == incomePlace) {
                        tax += (taxableIncome - brackets[filingStatus][i - 1] * rates[i]);
                    } else {
                        tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1] * rates[i]);
                    }
                }
            }
        }
        return tax;
    }
}
