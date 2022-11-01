package chapters.chapter09.exercises.C09E01;

public class Rectangle {
    double width = 1;
    double height = 1;


    Rectangle(){
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double getArea(){
        return height * width;
    }

    double getPerimeter(){
        return 2 * (height + width);
    }

    public void print(){
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
}
