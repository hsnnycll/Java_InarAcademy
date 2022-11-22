package chapters.chapter12.exercises.C12E05;

import chapters.chapter11.exercises.C11E01.GeometricObject;

public class ModifiedTriangle extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    public ModifiedTriangle() throws IllegalTriangleException{
        this(1.0, 1.0, 1.0);
    }

    public ModifiedTriangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if (side1 + side2 < side3){
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side");
        }if (side1 + side3 < side2){
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side");
        }if (side3 + side2 < side1){
            throw new IllegalTriangleException("The sum of any two sides must be greater than the other side");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea(){
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter(){
        return side1 + side2 + side3;

    }
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
