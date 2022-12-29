package chapters.chapter10.exercises.C10E08;

public class UseTax {
    public static void main(String[] args) {

        System.out.println("\t\t\t\t\t\t\t\t2001");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Taxable Income\tStatus(0)\t\t\tStatus(1)\t\t\tStatus(2)\t\t\tStatus(3)");

        int[][] brackets = {
                {27_050, 65_550, 136_750, 297_350},
                {45_200, 109_250, 166_500, 297_350},
                {22_600, 54_620, 83_250, 148_675},
                {36_250, 93_650, 151_650, 297_350}};

        double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391};

        Tax t0 = new Tax(Tax.SINGLE_FILER, brackets, rates, 0);
        Tax t1 = new Tax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW, brackets, rates, 0);
        Tax t2 = new Tax(Tax.MARRIED_SEPARATELY, brackets, rates, 0);
        Tax t3 = new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets, rates, 0);

        for (int i = 50000; i <= 60000; i += 1000) {
            t0.setTaxableIncome(i);
            t1.setTaxableIncome(i);
            t2.setTaxableIncome(i);
            t3.setTaxableIncome(i);

            System.out.printf("%d\t\t\t%.3f\t\t\t%.3f\t\t\t%.3f\t\t\t%.3f", i, t0.getTax(), t1.getTax(), t2.getTax(), t3.getTax());
            System.out.println();
        }
    }
}
