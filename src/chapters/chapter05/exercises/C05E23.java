package chapters.chapter05.exercises;

public class C05E23 {
	public static void main(String[] args) {

		double sum = 0;
		for (double num = 1; num <= 50000; num++) {
			sum += 1 / num;
		}
		System.out.println("The result of the summation from left to right: " + sum);

		double sum2 = 0;
		for (double num2 = 50000; num2 > 1; num2--) {
			sum2 += 1 / num2;
		}
		System.out.println("The result of the summation from right to left: " + sum2);
	}
}
