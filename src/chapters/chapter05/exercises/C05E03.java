package chapters.chapter05.exercises;

public class C05E03 {
	public static void main(String[] args) {
		System.out.println("Kilograms\tPounds");
		
		for(int k = 1; k < 200; k++) {
			System.out.printf("%-14d%6.1f\n", k, (k * 2.2));
		}
	}
}
