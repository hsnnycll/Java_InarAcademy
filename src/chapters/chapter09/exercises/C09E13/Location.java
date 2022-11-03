package chapters.chapter09.exercises.C09E13;

public class Location {

    public int row;
    public int column;
    public double maxValue;

    public Location() {
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public String toString(){
        return "The location of the largest element is " + getMaxValue() + " at (" + getRow() + ", " + getColumn() + ")";
    }
}
