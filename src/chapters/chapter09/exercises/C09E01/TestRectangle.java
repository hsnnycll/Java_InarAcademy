package chapters.chapter09.exercises.C09E01;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.setWidth(4);
        rec1.setHeight(40);
        System.out.println("The values of the first rectangle:");
        rec1.print();
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());

        Rectangle rec2 = new Rectangle(3.5, 35.9);
        System.out.println("The values of the second rectangle:");
        rec2.print();
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
    }
}
