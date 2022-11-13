package weeks.week_14;

public class Animal {

    private double height;
    private double weight;
    private boolean ableToFly;
    private boolean ableToSwim;


    public Animal() {
    }

    public Animal(double height, double weight, boolean ableToFly, boolean ableToSwim) {
        this.height = height;
        this.weight = weight;
        this.ableToFly = ableToFly;
        this.ableToSwim = ableToSwim;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAbleToFly() {
        return ableToFly;
    }

    public void setAbleToFly(boolean ableToFly) {
        this.ableToFly = ableToFly;
    }

    public boolean isAbleToSwim() {
        return ableToSwim;
    }

    public void setAbleToSwim(boolean ableToSwim) {
        this.ableToSwim = ableToSwim;
    }

    public void runs(){
        System.out.println("Animal is running.");
    }

    public void eats(){
        System.out.println("Animal is eating.");
    }

    public void sleeps(){
        System.out.println("Animal is sleeping.");
    }

    public void roar(){
        System.out.println("Animal is roaring.");
    }
}
