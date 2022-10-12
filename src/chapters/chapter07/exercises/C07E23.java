package chapters.chapter07.exercises;

public class C07E23 {
    public static void main(String[] args) {

        boolean[] lockers = new boolean[100];
        for (int i = 0; i < lockers.length; i++) {
            for (int j = i; j < lockers.length; j += i + 1) {
                lockers[i] = !lockers[i];
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i])
                System.out.println("Locker " + (i + 1) + " is open.");
        }
    }
}
