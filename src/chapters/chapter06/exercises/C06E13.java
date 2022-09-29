package chapters.chapter06.exercises;

public class C06E13 {
    public static void main(String[] args) {
        System.out.println("i            m(i)");
        System.out.println("--------------------");
        for (int i = 1; i <= 20 ; i++) {
            System.out.printf("%d\t\t\t%2.4f\n", i , m(i));
        }
    }

    public static double m(int i){
        double m = 0;
        for (int j = 1; j <= i; j++)
        m += j / (j + 1.0);
        return m;
    }
}
