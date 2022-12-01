package chapters.chapter13.exercises.C13E06;

public class ComparableCircle extends GeometricObject implements Comparable<ComparableCircle>{

    private double radius;

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        this.radius = radius;
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString(){
        return "Radius: " + this.radius;
    }

    @Override
    public int compareTo(ComparableCircle object) {
        if (this.getArea() > object.getArea()){
            return 1;
        }else if (this.getArea() < object.getArea()){
            return -1;
        }else {
            return 0;
        }
    }
}
