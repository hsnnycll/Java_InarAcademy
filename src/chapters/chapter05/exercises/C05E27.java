package chapters.chapter05.exercises;

public class C05E27 {
	public static void main(String[] args) {
		
		int count = 1;
		for(int year = 101; year < 2101; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.print(year + " ");
				if (count % 10 == 0) {
					System.out.println();
				}
				count++;
			}
		}
	}

}
