package chapters.chapter11.exercises.C11E01;

import java.util.Date;

public class GeometricObject {
    private String color = "white";
    private boolean filled;


    public GeometricObject() {

    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Color: " + color + " and filled: " + filled;
    }
}
