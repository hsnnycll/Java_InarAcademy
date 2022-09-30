package chapters.chapter06.exercises;

public class C06E14 {
    public static void main(String[] args) {
        System.out.println("i            m(i)");
        System.out.println("--------------------");
        for (int i = 1; i < 1000; i += 100) {
            System.out.printf("%d\t\t\t%2.4f\n", i, m(i));
        }
    }

    public static double m(int i) {
        double m = 0;
        for (int j = 1; j <= i; j++) {
            m += Math.pow((-1), (j + 1)) / (2 * j - 1);
        }
        return m * 4;
    }
}
