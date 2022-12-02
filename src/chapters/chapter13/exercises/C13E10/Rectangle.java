package chapters.chapter13.exercises.C13E10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{

   private double width;
   private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals(Object object) {
        Rectangle rectangle = (Rectangle) object;
        return (this.getArea() == rectangle.getArea());
    }

    @Override
    public String toString(){
        return "Width: " + this.width + " Height: " + this.height;
    }

    @Override
    public int compareTo(Rectangle object) {
        if (this.getArea() > object.getArea()) {
            return 1;
        } else if (this.getArea() < object.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
