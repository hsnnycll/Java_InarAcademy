package chapters.chapter05.exercises;

public class C05E06 {
	public static void main(String[] args) {
		System.out.println("Miles    Kilometers     |    Kilometers    Miles");

		int j =20;
		for (int k = 1; k <= 10; k++) {
			System.out.printf("%-11d%.3f", k, (k * 1.609));
			System.out.print("\t|\t");
			System.out.printf("%-11d%.3f\n", j, (j / 1.609));
			
			j += 5;
			}
		}
}
