package chapters.chapter07.exercises;

public class C07E07 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        int[] counts = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;
        }
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + " : " + counts[i]);
        }
    }
}
