package chapters.chapter10.checkpoints;

public class CheckPoint10_15 {
    public static void main(String[] args) {

        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println("a." + (s1 == s2));
        System.out.println("b." + (s1 == s3));
        System.out.println("c." + (s1 == s4));
        System.out.println("d." + (s1.equals(s3)));
        System.out.println("e." + (s1.equals(s4)));
        System.out.println("f." + ("Welcome to Java".replace("Java", "HTML")));
        System.out.println("g." + (s1.replace('o', 'T')));
        System.out.println("h." + (s1.replaceAll("o", "T")));
        System.out.println("i." + (s1.replaceFirst("o", "T")));
        System.out.print("j.");
        System.out.print(s1.toCharArray());

    }
}
