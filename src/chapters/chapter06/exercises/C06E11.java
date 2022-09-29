package chapters.chapter06.exercises;

public class C06E11 {
    public static void main(String[] args) {
        System.out.println("Sales          Comission");
        System.out.println("-------------------------");
        for (double i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%.0f\t\t\t%.1f\n", i, computeComission(i));
        }
    }

    public static double computeComission(double salesAmount) {
        double comission;
        if (salesAmount < 5000) {
            comission = salesAmount * 0.08;
        } else if (5000 <= salesAmount && salesAmount <= 10000) {
            comission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
        } else
            comission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000) * 0.12;

        return comission;
    }
}
