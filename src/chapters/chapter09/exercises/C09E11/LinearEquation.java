package chapters.chapter09.exercises.C09E11;

public class LinearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation() {
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double geta() {
        return a;
    }

    public double getb() {
        return b;
    }

    public double getc() {
        return c;
    }

    public double getd() {
        return d;
    }

    public double gete() {
        return e;
    }

    public double getf() {
        return f;
    }

    public boolean isSolvable(){
        if(a * d - b * c != 0){
            return true;
        }else{
            return false;
        }
    }

    public double getX(){
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY(){
        return (a * f - e * c) / (a * d - b * c);
    }
}
