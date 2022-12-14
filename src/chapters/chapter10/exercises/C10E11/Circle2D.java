package chapters.chapter10.exercises.C10E11;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public boolean contains(double x, double y){
        double distanceFromCenterPoint = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return distanceFromCenterPoint < radius;
    }

    public boolean contains(Circle2D circle){
        double distanceBetweenCenterPoints = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return this.radius > (distanceBetweenCenterPoints + circle.getRadius());
    }

    public boolean overlaps(Circle2D circle){
        return (Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2)) == circle.getRadius() + this.radius);
    }
}
