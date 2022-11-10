package chapters.chapter10.exercises.C10E13;

public class TestMyRectangle2D {
    public static void main(String[] args) {

        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("The area of the rectangle r1: " + r1.getArea());
        System.out.println("The perimeter of the rectangle r1: " + r1.getPerimeter());
        System.out.println(r1.contains(3, 3));
        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
    }
}
