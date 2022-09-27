package chapters.chapter06.checkpoints;

public class CheckPoint6_13 {
    public static void main(String[] args) {
        System.out.println("Part A");
        partA();
        System.out.println("Part B");
        partB();
        System.out.println("Part C");
        partC();
        System.out.println("Part D");
        partD();
    }

    public static void partA() {
        int max = 0;
        max(1, 2, max);
        System.out.println(max);
    }

    public static void max(int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }

    public static void partB() {
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    public static void partC() {
        int times = 3;
        System.out.println("Before the call," + " variable times is " + times);

        nPrintln("Welcome to Java!", times);
        System.out.println("After the call," + " variable times is " + times);
    }

    public static void nPrintln(String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

    public static void partD() {
        int i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
    }

    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);
        System.out.println();
    }
}
