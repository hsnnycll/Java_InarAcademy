package chapters.chapter13.exercises.C13E10;

public class Test {
    public static void main(String[] args) {

        GeometricObject rectangle = new Rectangle(3, 5);
        GeometricObject rectangle1 = new Rectangle(5, 3);

        System.out.println("The areas of the rectangles equal?: " + rectangle.equals(rectangle1));

    }
}
