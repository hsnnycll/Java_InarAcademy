package chapters.chapter02;

public class ShowCurrentTime {
	public static void main(String[] args) {
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970  
		long totalMilliseconds = System.currentTimeMillis();
		System.out.println(totalMilliseconds);
		
		//Obtain the total seconds since midnigt, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		System.out.println(totalSeconds);
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
				System.out.println(currentSecond);
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		System.out.println(totalMinutes);
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		System.out.println(currentMinute);
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		System.out.println(totalHours);
		
		//Compute the current hour
		long currentHours = totalHours % 24;
		System.out.println(currentHours);
		
		//Display results
		System.out.println("Current time is " + currentHours + ":" 
		+ currentMinute + ":" + currentSecond + " GMT");
		
		
		
	}

}
