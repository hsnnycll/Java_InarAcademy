package weeks.week_15;

public class Calculator extends Number {

    public static final double ZERO = 0;

    public Calculator(Double value) {
        super(value);
    }

    public double multiply(double value) {
        setValue(getValue() * value);
        return getValue() * value;
    }

    public double sum(double value) {
        setValue(getValue() + value);
        return getValue() + value;
    }

    public double subtract(double value){
        setValue(getValue() - value);
        return getValue() - value;
    }

    public double divide(double value){
        if(value == 0){
            System.out.println("Invalid input");
            return -1;
        }
        setValue(getValue() / value);
        return getValue() / value;
    }

    public double modify(double value){
        setValue(getValue() % value);
        return getValue() % value;
    }

    public void convertNegative(){
        setValue(getValue() * -1);
    }

    public void clear(){
        setValue(ZERO);
    }

    @Override
    public String toString(){
        return "Result " + getValue();
    }
}
