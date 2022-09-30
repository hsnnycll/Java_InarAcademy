package chapters.chapter06.exercises;

public class C06E30 {
    public static void main(String[] args) {
        int d1 = (int) (Math.random() * 6 + 1);
        int d2 = (int) (Math.random() * 6 + 1);
        int sumd = d1 + d2;
        System.out.println("You rolled " + d1 + " + " + d2 + " = " + sumd);
        if (sumd == 2 || sumd == 3 || sumd == 12) {
            System.out.println("You losed.");
        } else if (sumd == 7 || sumd == 11) {
            System.out.println("You win.");
        } else {
            System.out.println("point is " + sumd);
            int newd1, newd2, newsum;
            do {
                newd1 = (int) (Math.random() * 6 + 1);
                newd2 = (int) (Math.random() * 6 + 1);
                newsum = newd1 + newd2;
                if (newsum == sumd) {
                    System.out.println("You rolled " + newd1 + " + " + newd2 + " = " + newsum);
                    System.out.println("You win.");
                } else if (newd1 + newd2 == 7) {
                    System.out.println("You rolled " + newd1 + " + " + newd2 + " = " + newsum);
                    System.out.println("You lose.");
                }
            } while (!(newsum == sumd || newsum == 7));
        }
    }
}
