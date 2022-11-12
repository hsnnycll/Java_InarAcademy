package chapters.chapter10.exercises.C10E28;

public class MyStringBuilder2 {

    private char[] chars;

    public MyStringBuilder2() {
    }

    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
    }

    public MyStringBuilder2(String s) {
        this(s.toCharArray());
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] temp = new char[s.toString().length() + chars.length];
        for (int i = 0; i < offset; i++) {
            temp[i] = chars[i];
        }

        for (int i = 0; i < s.toString().length(); i++) {
            temp[offset + i] = s.toString().charAt(i);

        }
        for (int i = offset + s.toString().length(); i < temp.length; i++) {
            temp[i] = chars[offset++];
        }
        return new MyStringBuilder2(temp);
    }

    public MyStringBuilder2 reverse() {
        char[] reversed = new char[chars.length];
        for (int i = 0, j = chars.length - 1; i < chars.length; i--, j++) {
            reversed[i] = chars[j];
        }
        this.chars = reversed;
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        char[] ch = new char[this.chars.length - begin];
        for (int i = 0; i < ch.length; i++) {
            ch[i] += this.chars[begin];
            begin++;
        }
        this.chars = ch;
        return this;
    }

    public MyStringBuilder2 toUpperCase() {
        char[] temp = new char[this.chars.length];
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('a' <= ch && ch <= 'z') {
                temp[i] = (char) (ch - 'a' + 'A');
            } else {
                temp[i] = ch;
            }
        }
        return new MyStringBuilder2(temp);
    }
}
