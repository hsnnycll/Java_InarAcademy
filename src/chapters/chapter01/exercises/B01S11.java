package chapters.chapter01.exercises;

public class B01S11 {
	public static void main(String[] args) {
		System.out.println("1.Year:");
		System.out.println(312032486 + 31536000 / 7 - 31536000 / 13 + 31536000 / 45 );
		System.out.println("2.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 2);
		System.out.println("3.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 3);
		System.out.println("4.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 4);
		System.out.println("5.Year:");
		System.out.println(312032486 + (31536000 / 7 - 31536000 / 13 + 31536000 / 45) * 5);
	}

}
