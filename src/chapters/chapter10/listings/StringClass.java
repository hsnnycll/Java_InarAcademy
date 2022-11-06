package chapters.chapter10.listings;

public class StringClass {
    public static void main(String[] args) {

        Integer n1 = 128;
        Integer n2 = 128;
        System.out.println(n1 == n2);
        System.out.println("----------------------");

        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";
        System.out.println("s1 == s2 is " + (s1 == s2));
        System.out.println("s1 == s3 is " + (s1 == s3));
        System.out.println("----------------------");

        System.out.println("Welcome".replace('e', 'A'));
        System.out.println("Welcome".replaceFirst("e", "AB"));
        System.out.println("Welcome".replace("e", "AB"));
        System.out.println("Welcome".replace("el", "AB"));
        System.out.println("----------------------");

        String[] tokens = "Java#HTML#Perl".split("#");
        for (int i = 0; i < tokens.length; i++) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println();
        System.out.println("----------------------");

        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));
        System.out.println("----------------------");

        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
        System.out.println("----------------------");

        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
        System.out.println("----------------------");

        String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        System.out.println(s);
        System.out.println("----------------------");

        String[] array = "Java,C?C#,C++".split("[.,:;?]");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------");

        char[] chars = "Java".toCharArray();
        System.out.println(chars);
        System.out.println("----------------------");

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1', '2'};
        "CSHello".getChars(2, 7, dst, 4);
        System.out.println(dst);
        System.out.println("----------------------");

        String str = new String(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str);
        String str1 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
        System.out.println(str1);
        String str2 = String.format("%7.2f|%6d|%-4s", 45.556, 14, "AB");
        System.out.println(str2);
        System.out.println("----------------------");
    }
}
