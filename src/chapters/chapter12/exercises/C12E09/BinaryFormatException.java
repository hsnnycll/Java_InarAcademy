package chapters.chapter12.exercises.C12E09;

public class BinaryFormatException extends Exception{

    public BinaryFormatException(String message){
        super("BinaryFormatException: " + message);
    }
}
