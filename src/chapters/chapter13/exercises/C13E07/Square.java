package chapters.chapter13.exercises.C13E07;

public class Square extends GeometricObject implements Colorable{

    private double side;

    public Square() {
    }

    public Square(double side) {
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
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 2 * side;
    }

    @Override
    public String toString(){
        return "Side: " + this.side;
    }

    @Override
    public void howToColor() {
        System.out.println("Square: Color all four sides.");
    }
}
