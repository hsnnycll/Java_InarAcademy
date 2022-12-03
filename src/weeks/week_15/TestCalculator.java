package weeks.week_15;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator calculate = new Calculator(150.0);
        calculate.sum(6);
        System.out.println(calculate);
        calculate.subtract(10);
        System.out.println(calculate);
        calculate.divide(5);
        System.out.println(calculate);
        calculate.modify(10);
        System.out.println(calculate);


    }
}
