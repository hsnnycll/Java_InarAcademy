package chapters.chapter06.exercises;

public class C06E32 {
    public static void main(String[] args) {
       System.out.println("The number of winnig games is " + craps(10000));
    }

    public static int craps(int playtimes){
        int count = 0;
        for (int i = 0; i < playtimes; i++) {
            int d1 = (int) (Math.random() * 6 + 1);
            int d2 = (int) (Math.random() * 6 + 1);
            int sumd = d1 + d2;
            if (sumd == 2 || sumd == 3 || sumd == 12) {
            } else if (sumd == 7 || sumd == 11) {
                count++;
            } else {
                int newd1, newd2, newsum;
                do {
                    newd1 = (int) (Math.random() * 6 + 1);
                    newd2 = (int) (Math.random() * 6 + 1);
                    newsum = newd1 + newd2;
                    if (newsum == sumd)
                        count++;
                } while (!(newsum == sumd || newsum == 7));
            }
        }return count;
    }
}
