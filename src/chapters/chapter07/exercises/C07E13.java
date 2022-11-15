package chapters.chapter07.exercises;

public class C07E13 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 53, 44, 9};
        System.out.println(getRandom(numbers));
    }

    public static int getRandom(int... numbers) {
        int number = (int)(Math.random() * 54 + 1);
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                number = (int) (Math.random() * 54 + 1);
                i = 0;
            }
        }
        return number;
    }
}
