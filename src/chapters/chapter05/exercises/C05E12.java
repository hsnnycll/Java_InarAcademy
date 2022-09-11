package chapters.chapter05.exercises;

public class C05E12 {
	public static void main(String[] args) {
		int number = 0;
		while (number < 12000) {
			number++;
			if(Math.pow(number, 2) > 12000) {
				break;
			}
		}
		System.out.println(number);
	}
}
