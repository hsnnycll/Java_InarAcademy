package chapters.chapter13.exercises.C13E11;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Octagon octagon = new Octagon(5);

        Octagon octagon1 = (Octagon) octagon.clone();

        if (octagon.compareTo(octagon1) == 0) {
            System.out.println("The two octagons are the same");
        }else {
            System.out.println("The two octagons are not same");
        }
    }
}
