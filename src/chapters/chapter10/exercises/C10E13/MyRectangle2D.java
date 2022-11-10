package chapters.chapter10.exercises.C10E13;

import chapters.chapter10.exercises.C10E04.MyPoint;

public class MyRectangle2D {

    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public boolean contains(double x, double y) {
        double maxYOfRec = this.y + this.height / 2;
        double maxXOfRec = this.x + this.width / 2;
        double minYOfRec = this.y - this.height / 2;
        double minXOfRec = this.x - this.width / 2;

        return  (minXOfRec <= x && x >= maxXOfRec && minYOfRec <= y && y >= maxYOfRec);
    }

    public boolean contains(MyRectangle2D r){
        double distanceOfX = r.getX() > this.x ? r.getX() - this.x : this.x - r.getX();
        double distanceOfY = r.getY() > this.y ? r.getY() - this.y : this.y - r.getY();

        return  (distanceOfX <= (Math.pow(this.width - r.getWidth(), 2) / 2 * (this.width - r.getWidth()))
                && distanceOfY <= (Math.pow(this.y - r.getY(), 2) / 2 * (this.y - r.getY())));
    }

    public boolean overlaps(MyRectangle2D r){
        double distanceOfX = r.getX() > this.x ? r.getX() - this.x : this.x - r.getX();
        double distanceOfY = r.getY() > this.y ? r.getY() - this.y : this.y - r.getY();

        return  ((distanceOfX <= (this.width + r.getWidth()) / 2) || (distanceOfY <= (this.y + r.getY()) / 2));
    }
}
