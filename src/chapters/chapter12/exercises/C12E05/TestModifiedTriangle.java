package chapters.chapter12.exercises.C12E05;

public class TestModifiedTriangle {
    public static void main(String[] args) {

        try {
            ModifiedTriangle triangle1 = new ModifiedTriangle(1.0, 1.0, 3.0);
            System.out.println(triangle1.getPerimeter());
        }
        catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }

        try {
            ModifiedTriangle triangle1 = new ModifiedTriangle(1.0, 1.0, 2.0);
            System.out.println(triangle1.getPerimeter());
        }
        catch (IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
    }
}
