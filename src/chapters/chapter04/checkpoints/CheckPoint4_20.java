package chapters.chapter04.checkpoints;

public class CheckPoint4_20 {
	public static void main(String[] args) {
		
		String s1 = " Welcome ";
		String s2 = " welcome ";
		
		boolean isEqual = s1 == s2;
		System.out.println(isEqual);
		
		boolean isEqual1 = s1.equalsIgnoreCase(s2);
		System.out.println(isEqual1);
		
		int x = s1.compareTo(s2);
		System.out.println(x);
		
		int x1 = s1.compareToIgnoreCase(s2);
		System.out.println(x1);
		
		boolean b = s1.startsWith("AAA");
		System.out.println(b);
		
		boolean b1 = s1.endsWith("AAA");
		System.out.println(b1);
		
		int x2 = s1.length();
		System.out.println(x2);
		
		char x3 = s1.charAt(0);
		System.out.println(x3);
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		String s1sub = s1.substring(1);
		System.out.println(s1sub);
		
		String s1sub1 = s1.substring(1, 4);
		System.out.println(s1sub1);
		
		String s4 = s1.toLowerCase();
		System.out.println(s4);
		
		String s5 = s1.toUpperCase();
		System.out.println(s5);
		
		String s6 = s1.trim();
		System.out.println(s6);
		
		int x4 = s1.indexOf('e');
		System.out.println(x4);
		
		int x5 = s1.indexOf("abc");
		System.out.println(x5);
		
	}

}
