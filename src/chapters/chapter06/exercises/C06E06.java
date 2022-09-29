package chapters.chapter06.exercises;

public class C06E06 {
    public static void main(String[] args) {
        displayPattern(7);
    }
    public static void displayPattern(int n){
        for (int i = 1; i < n; i++) {
            for (int s = n - i; s > 0 ; s--) {
                System.out.print("  ");
            }
            for (int a = i; a > 0 ; a--) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
