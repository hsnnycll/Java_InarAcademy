package chapters.chapter12.exercises.C12E08;

public class HexFormatException extends Exception{

    public HexFormatException(String message){
        super("HexFormatException: " + message);
    }
}
