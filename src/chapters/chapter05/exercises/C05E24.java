package chapters.chapter05.exercises;

public class C05E24 {
	public static void main(String[] args) {
		
		double sum = 0;
		for (int num = 1; num <= 97; num += 2 ) {
			sum += num / num + 2;
		}
		System.out.println("The sum of the series is: " + sum );
	}

}
