package chapters.chapter07.exercises;

public class C07E13 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 53, 44, 9};
        System.out.println(getRandom(numbers));
    }

    public static int getRandom(int... numbers) {
        int number = 0;
        for (int i = 0; i < numbers.length; i++) {
            number = (int) (Math.random() * 54 + 1);
            if (number != numbers[i])
                break;
        }
        return number;
    }
}
