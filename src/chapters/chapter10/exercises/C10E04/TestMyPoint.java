package chapters.chapter10.exercises.C10E04;

public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The distance between two points: " + point1.distance(point2));
    }
}
