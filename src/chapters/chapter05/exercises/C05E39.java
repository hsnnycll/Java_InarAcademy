package chapters.chapter05.exercises;

public class C05E39 {
    public static void main(String[] args) {
        double commision = 0;
        double sales = 30000;
        double salary = 5000;

        while (commision + salary <= 30_000) {
            commision = 0;
            commision += 5000 * 0.08;
            commision += 5000 * 0.10;
            commision += (sales - 10000) * 0.12;
            sales += 0.01;
        }

        System.out.printf("You'll need to make $%1.2f in sales.", sales);
    }
}
