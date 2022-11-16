package chapters.chapter11.exercises.C11E03;

public class Test {
    public static void main(String[] args) {

        CheckingAccount  c = new CheckingAccount(03, 5000, -500);
        SavingAccount s = new SavingAccount(14, 1000);

        c.withDraw(5200);
        s.withDraw(2000);

        System.out.println(c);
        System.out.println(s);
    }
}
