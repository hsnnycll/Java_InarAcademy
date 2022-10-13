package chapters.chapter07.exercises;

public class C07E29 {
    public static void main(String[] args) {

        int[] pick = new int[4];
        while(!isSumEquals24(pick)){
            for (int i = 0; i < pick.length; i++) {
                pick[i] = (int)(Math.random() * 52);
            }
        }

        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < 4; i++) {
            String suit = suits[pick[i] / 13];
            String rank = ranks[pick[i] % 13];
            System.out.println(rank + " of " + suit);
        }
    }

    public static boolean isSumEquals24(int[] pick){
        int sum = 0;
        for (int i = 0; i < pick.length; i++) {
            sum += pick[i] % 13;
        }
        if(sum == 20)
            return true;
        else
            return false;
    }
}
