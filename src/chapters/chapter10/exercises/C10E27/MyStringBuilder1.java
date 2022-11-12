package chapters.chapter10.exercises.C10E27;

public class MyStringBuilder1 {

    private String s;

    public MyStringBuilder1(String s) {
        this.s = s;
    }

    public MyStringBuilder1 append(MyStringBuilder1 s){
        this.s = this.s + s.toString();
        return this;
    }

    public MyStringBuilder1 append(int i){
        this.s = this.s + i;
        return this;
    }

    public int length(){
        return this.s.length();
    }

    public char charAt(int index){
        return this.s.charAt(index);
    }

    public MyStringBuilder1 toLowerCase(){
        String str = "";
        for (int i = 0; i < this.s.length(); i++) {
            if('A' <= this.s.charAt(i) && this.s.charAt(i) <= 'Z'){
                char ch = (char) (s.charAt(i) - ('A' - 'a'));
                str += ch;
            }else{
                str += this.s.charAt(i);
            }
        }
        this.s = str;
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end){
        String str = "";
        for (int i = begin; i < end; i++) {
            str += this.s.charAt(i);
        }
        this.s = str;
        return this;
    }

    public String toString(){
        return this.s;
    }
}
