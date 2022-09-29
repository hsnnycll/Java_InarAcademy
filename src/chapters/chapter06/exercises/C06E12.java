package chapters.chapter06.exercises;

public class C06E12 {
    public static void main(String[] args) {
        System.out.println("The characters from 1 to Z;");
        printChars('1', 'Z', 10);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        for (int i = ch1; i <= ch2; i++) {
            count++;
            System.out.print((char)i + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
        }
    }
}