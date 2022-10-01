package chapters.chapter06.exercises;

import chapters.chapter06.listings.RandomCharacter;

public class C06E38 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
            count++;
            if(count % 10 == 0)
                System.out.println();
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
            count++;
            if (count % 10 == 0)
                System.out.println();
        }
    }
}
