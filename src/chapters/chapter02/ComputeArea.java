package chapters.chapter02;

public class ComputeArea {
	public static void main(String[] args) {
		double radius;
		double area;
		
		// Step 1: Read in radius
		radius = 20.0;
		// Step 2: Compute area
		area = radius * radius * 3.14159;
		// Step 3: Display the area
		System.out.println("The area for the circle of radius " + radius + " is " + area );
		
	}

}
