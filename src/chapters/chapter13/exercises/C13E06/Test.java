package chapters.chapter13.exercises.C13E06;

public class Test {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(8.5);
        ComparableCircle c2 = new ComparableCircle(8.5);

        if (c1.compareTo(c2) == 1){
            System.out.println("The larger circle is: " + c1);
        }else if (c1.compareTo(c2) == 0){
            System.out.println("Both of them are equal");
        }else {
            System.out.println("The larger circle is: " + c2);
        }
    }
}
