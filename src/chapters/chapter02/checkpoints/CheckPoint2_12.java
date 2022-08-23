package chapters.chapter02.checkpoints;

public class CheckPoint2_12 {
	public static void main(String[] args) {
		//Today is Tuesday, so second day of week
		
		int today = (2 + 100) % 7;
		
		System.out.println("Today is " + today + "th day of week ");
	}

}
