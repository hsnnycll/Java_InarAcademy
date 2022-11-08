package chapters.chapter10.exercises.C10E04;

public class MyPoint {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        this(0, 0);
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point){
        return distance(point.getX(), point.getY());
    }

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
}
