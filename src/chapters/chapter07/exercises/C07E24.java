package chapters.chapter07.exercises;

public class C07E24 {
    public static void main(String[] args) {

        int[] deck = new int[4];
        int count = 0;
        while (!(deck[0] / 13 == 0 && deck[1] / 13 == 1 && deck[2] / 13 == 2 && deck[3] / 13 == 3)) {
            for (int i = 0; i < deck.length; i++) {
                int random = (int) (Math.random() * 52);
                deck[i] = random;
            }
            count++;
        }

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for (int i = 0; i < deck.length; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
        System.out.println("Number of picks :" + count);
    }
}
