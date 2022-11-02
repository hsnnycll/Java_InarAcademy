package chapters.chapter09.exercises.C09E11;

public class TestLinearEquation {
    public static void main(String[] args) {

        LinearEquation equation = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
        System.out.println(equation);

        System.out.println("------");

        LinearEquation equation1 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
        System.out.println(equation1);
    }
}
