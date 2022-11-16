package chapters.chapter11.exercises.C11E01;

public class TestTriangle {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(4.0, 5.0, 9.0);
        triangle1.setColor("Black");
        triangle1.setFilled(true);
        System.out.println(triangle1);
        System.out.println("The color is " + triangle1.getColor() + " and filled is " + triangle1.isFilled());
        System.out.println("The area of triangle is " + triangle1.getPerimeter());
    }
}
