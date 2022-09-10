package chapters.chapter05.exercises;

public class C05E04 {
	public static void main(String[] args) {
		System.out.println("Miles\tKilometers");

		for(int k = 1; k <= 10; k++) {
			System.out.printf("%-10d%2.3f\n", k, (k * 1.609));
		}
	}
}
