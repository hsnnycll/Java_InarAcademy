package chapters.chapter12.exercises.C12E05;

public class IllegalTriangleException extends Exception{

    public IllegalTriangleException(String s) {
        super("IllegalTriangleException: " + s);
    }
}
