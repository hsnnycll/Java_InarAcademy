package chapters.chapter05.checkpoints;

public class CheckPoint5_19 {
	public static void main(String[] args) {

		int sayac = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				sayac++;
				System.out.println(sayac + " : " + i * j);
			}
		}
	}
}
