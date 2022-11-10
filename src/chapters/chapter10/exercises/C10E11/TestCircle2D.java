package chapters.chapter10.exercises.C10E11;

public class TestCircle2D {
    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("The area of circle: " + c1.getArea());
        System.out.println("The perimeter of circle: " + c1.getPerimeter());
        System.out.println("The point 3, 3 is " + (c1.contains(3, 3) ? "in the circle" : "not int he circle"));
        System.out.println("The circle (4, 5), r = 10.5 is " + (c1.contains(new Circle2D(4, 5, 10.5))
                ? "in the circle" : "not in the circle"));
        System.out.println("The circle (3, 5), r = 2.3 " + (c1.overlaps(new Circle2D(3, 5, 2.3))
                ? "overlaps the circle" : "doesn't overlap the circle"));
    }
}
