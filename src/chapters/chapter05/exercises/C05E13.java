package chapters.chapter05.exercises;

public class C05E13 {
	public static void main(String[] args) {
		int number = 0;
		while(number < 12000) {
			number++;
			if (Math.pow(number, 3) > 12000) {
				break;
			}
		}
		System.out.println(number - 1);
	}
}
