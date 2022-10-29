package chapters.chapter09.checkpoints;

import java.util.Date;

public class CheckPoint9_26a {
    public static void main(String[] args) {
        Date date = null;
        m1(date);
        System.out.println(date);
    }

    public static void m1(Date date) {
        date = new Date();
    }
}
