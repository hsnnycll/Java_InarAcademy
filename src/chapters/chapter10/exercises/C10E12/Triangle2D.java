package chapters.chapter10.exercises.C10E12;

import chapters.chapter10.exercises.C10E04.MyPoint;

public class Triangle2D {

    MyPoint p1;
    MyPoint p2;
    MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0,0), new MyPoint(1,1), new MyPoint(2,5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea(){
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        double s = (side1 + side2 + side3) / 3;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

        return area;
    }

    public double getPerimeter() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        return side1 + side2 + side3;
    }

    /*public boolean contains(MyPoint p){
    }

    public boolean contains(Triangle2D t){
    }

    public boolean overlaps(Triangle2D t){

    }*/
}
