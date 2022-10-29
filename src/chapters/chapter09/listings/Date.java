package chapters.chapter09.listings;

public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
    }
}