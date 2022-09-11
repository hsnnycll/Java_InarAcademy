package chapters.chapter05.exercises;

public class C05E05 {
	public static void main(String[] args) {
		System.out.println("Kilograms    Pounds     |    Pounds    Kilograms");

		int j =20;
		for (int k = 1; k < 200; k += 2) {
			System.out.printf("%-15d%.1f", k, (k * 2.2));
			System.out.printf("\t|\t");
			System.out.printf("%-9d%.2f\n", j, (j / 2.2));
			
			j += 5;
			}
		}
	}

