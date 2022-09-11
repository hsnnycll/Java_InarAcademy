package chapters.chapter05.exercises;

public class C05E07 {
	public static void main(String[] args) {
		
		double tuition = 10000;
		double total4 = 0;
		for (int y = 1; y <= 10; y++) {
			tuition = tuition * 1.05;
			if (y < 5) {
			total4 += tuition;
		}
		}
		System.out.printf("The total cost of four years is %.2f\n ", total4);
		System.out.printf("The worth of tuition the tenth year is %.2f ", tuition);
	}

}
