package chapters.chapter05.exercises;

public class C05E40 {
	public static void main(String[] args) {
		
		int tails = 0;
        int heads = 0;
        for (int i = 0; i < 1000000; i++) {

            int flip = (int) (Math.random() * 2);
            if (flip == 1) {
                heads++;
            } else
                tails++;
        }
        System.out.println("Heads: " + heads + " Tails: " + tails);
	}

}
