package chapters.chapter07.exercises;

public class C07E24 {
    public static void main(String[] args) {

        int[] deck = new int[52];
        int[] pickedCards = new int[4];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        shuffle(deck);
        int numberOfPicks = setPickedCards(deck, pickedCards);
        displayPickedCards(pickedCards, numberOfPicks);
    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static void displayPickedCards(int[] pickedCards, int numberOfPicks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < pickedCards.length; i++) {
            String suit = suits[pickedCards[i] / 13];
            String rank = ranks[pickedCards[i] % 13];
            System.out.println(rank + " of " + suit);
        }
        System.out.println("Number of picks: " + numberOfPicks);
    }

    public static int setPickedCards(int[] deck, int[] pickedCards) {
        int card;
        int indexOfPickedCards = 0;
        int numberOfPicks = 0;
        while (indexOfPickedCards < 4) {
            final int INDEX_OF_DECK = 0;
            card = deck[INDEX_OF_DECK];
            if (isDictinct(pickedCards, card)) {
                pickedCards[indexOfPickedCards] = card;
                indexOfPickedCards++;
            }
            numberOfPicks++;
            placeBackInDeck(deck, card);
        }
        return numberOfPicks;
    }

    public static void placeBackInDeck(int[] deck, int card) {
        int randomIndex = (int) (Math.random() * deck.length);
        int temp = card;
        for (int i = 1; i < randomIndex; i++) {
            deck[i - 1] = deck[i];
        }
        deck[randomIndex] = temp;
    }

    public static boolean isDictinct(int[] pickedCards, int card) {
        for (int i = 0; i < pickedCards.length; i++) {
            if (pickedCards[i] == card) {
                return false;
            }
        }
        return true;
    }
}
