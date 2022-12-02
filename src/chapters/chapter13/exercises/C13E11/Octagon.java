package chapters.chapter13.exercises.C13E11;


public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2) * this.side * this.side);
    }

    @Override
    public double getPerimeter() {
        return 8 * this.side;
    }

    @Override
    public int compareTo(Octagon object) {
        if (this.getArea() > object.getArea()) {
            return 1;
        } else if (this.getArea() < object.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        Octagon octagon = (Octagon) super.clone();
        return octagon;
    }
}
