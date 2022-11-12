package chapters.chapter10.exercises.C10E22;

public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (!(begin > 0 && end < length() - 1 && end > 0 && end <= length() && begin < end)) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }
        char[] newArray = new char[end - begin];
        for (int newIndex = 0; newIndex < newArray.length; newIndex++) {
            newArray[newIndex] = charAt(begin);
            begin++;
        }
        return new MyString1(newArray);
    }

    public MyString1 toLowerCase() {
        char[] ch = new char[length()];

        for (int i = 0; i < length(); i++) {
            if ('Z' >= chars[i] && chars[i] >= 'A') {
                ch[i] = (char) (charAt(i) + ('a' - 'A'));
            } else {
                ch[i] = charAt(i);
            }
        }
        return new MyString1(ch);
    }

    public boolean equals(MyString1 str) {
        if (length() != str.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valeurOf(int i) {
        int count = 0;
        int number = 1;

        while (number > 0) {
            number /= 10;
            count++;
        }
        char[] ch = new char[count];
        for (int j = count; j >= 0; j--) {
            ch[j] = (char) ('0' + i % 10);
            i /= 10;
        }
        return new MyString1(ch);
    }
}
