package chapters.chapter13.exercises.C13E09;

public class Circle extends GeometricObject implements Comparable<Circle> {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
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
    public int compareTo(Circle object) {
        if (this.getArea() > object.getArea()) {
            return 1;
        } else if (this.getArea() < object.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object object) {
        Circle circle = (Circle) object;
        return (this.radius == circle.radius);
    }
}