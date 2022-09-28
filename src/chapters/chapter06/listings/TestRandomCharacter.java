package chapters.chapter06.listings;

public class TestRandomCharacter {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter.getRandomLowerCaseLetter() + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(RandomCharacter.getRandomCharacter() + " ");
        }
        System.out.println();
    }
}
