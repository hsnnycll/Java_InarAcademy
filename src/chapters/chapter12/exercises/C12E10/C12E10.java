package chapters.chapter12.exercises.C12E10;

public class C12E10 {
    public static void main(String[] args) {
        try {
            Integer[] array = new Integer[100000 * 100000];
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory: " + e.getMessage());
        }
    }
}
