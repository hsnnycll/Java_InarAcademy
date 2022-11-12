package chapters.chapter10.exercises.C10E23;

import chapters.chapter10.exercises.C10E22.MyString1;

public class MyString2 {

    private char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public int compare(String s){
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] > s.charAt(i)) {
                return 1;
            } else if (chars[i] < s.charAt(i)) {
                return -1;
            }
        }
        return 0;
    }

    public MyString1 substring(int begin) {
        if (!(0 < begin && begin < chars.length)) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }
        char[] newArray = new char[chars.length - begin];
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            newArray[newIndex] = chars[begin];
            begin++;
        }
        return new MyString1(newArray);
    }

    public MyString1 toUpperCase() {
        char[] ch = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] && chars[i] >= 'z') {
                ch[i] = (char) (chars[i] + ('A' - 'a'));
            } else {
                ch[i] = chars[i];
            }
        }
        return new MyString1(ch);
    }

    public char[] toChars(){
        return chars;
    }

    public static MyString2 valueOf(boolean b){
        return b ? new MyString2("true") : new MyString2("false");
    }
}
