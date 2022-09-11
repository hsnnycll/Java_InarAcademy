package weeks.week_04;

public class StringPractice {
	
	public static void main(String[] args) {
		
		toUpperCase();
		
	}
	
	public static void toUpperCase() {
		
		String temp = "Inar Academi";
		
		System.out.println(temp.toUpperCase());
	}
	
	public static void toLowerCase() {
		
		String temp = "I love Inar Academi";
		
		System.out.println(temp.toLowerCase());
	}
	
	public static void charAt() {
		
		String temp = "I love Inar";
		
		System.out.println(temp.charAt(5));
	}
	
	public static void trim() {

		String temp = " 	Inar  	Academi		";
		
		System.out.println(temp.trim());
	}
	
	public static void contains() {
		
		String temp = "Inar Academi";
	
		System.out.println(temp.contains("ar"));
	}
	
	public static void equalsIgnoreCase() {
		
		String temp = "InAr AcAdEmI";
		String temp2 = "ıNaR aCaDeMı";
		
		System.out.println(temp.equalsIgnoreCase(temp2));
		
	}
	
	public static void substring() {
		
		String temp = "Inar Academy";
		String yeni = temp.substring(3,9);
		System.out.println(temp);
		System.out.println(yeni);
	}
	
	public static void length() {
		
		String temp = "I love Inar Academy";
		
		int length = temp.length();
		
		System.out.println(length);
	}

}
