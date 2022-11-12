package chapters.chapter10.exercises.C10E24;

public class MyCharacter {

    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public boolean equals(char ch) {
        return this.ch == ch;
    }

    public int compareTo(char ch) {
        return this.ch - ch;
    }

    public static boolean isDigit(char ch) {
        return '0' <= ch && ch <= '9';
    }

    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public char toUpperCase(){
        return ('a' <= ch && ch <= 'z') ? ch = (char) (ch - 32) : ch;
    }
    public char toLowerCase(){
        return ('A' <= ch && ch <= 'Z') ? ch = (char) (ch + 32) : ch;
    }

}
