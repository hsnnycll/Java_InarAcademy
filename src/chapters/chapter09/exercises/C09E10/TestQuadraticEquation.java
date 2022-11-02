package chapters.chapter09.exercises.C09E10;

public class TestQuadraticEquation {
    public static void main(String[] args) {

        QuadraticEquation coeff = new QuadraticEquation(1, 2, 3);
        printRoots(coeff);

    }

    public static void printRoots(QuadraticEquation coeff){
        if(coeff.getDiscriminant() > 0){
            System.out.println("The one root is: " + coeff.getRoot1());
            System.out.println("The other root is: " + coeff.getRoot2());
        } else if (coeff.getDiscriminant() == 0) {
            System.out.println("The root is: " + coeff.getRoot1());
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}
