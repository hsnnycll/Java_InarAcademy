package chapters.chapter13.exercises.C13E12;

public class Test {
    public static void main(String[] args) {

        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(7);
        objects[1] = new Circle(9);
        objects[2] = new Rectangle(4, 9);
        objects[3] = new Rectangle(12.7, 3.4);

        System.out.println("The sum area of all geometric objects is: " + sumArea(objects));

    }

    public static double sumArea(GeometricObject[] a){
        double sumAreas = 0;
        for (GeometricObject ob : a) {
            sumAreas += ob.getArea();
        }
        return sumAreas;
    }
}
