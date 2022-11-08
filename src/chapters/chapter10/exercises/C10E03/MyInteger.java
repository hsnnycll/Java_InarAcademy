package chapters.chapter10.exercises.C10E03;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return this.value % 2 == 0;
    }

    public boolean isOdd(){
        return !isEven();
    }

    public boolean isPrime(){
        for (int i = 2; i < this.value; i++) {
            if(this.value / i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    public static boolean isPrime(int value){
        for (int i = 2; i < value; i++) {
            if(value / i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger value){
        return value.isEven();
    }

    public static boolean isOdd(MyInteger value){
        return value.isOdd();
    }

    public static boolean isPrime(MyInteger value){
        return value.isPrime();
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger value){;
        return this.value == value.getValue();
    }

    public static int parseInt(char[] array){
        return parseInt(new String(array));
    }

    public static int parseInt(String str){
        int value = Integer.parseInt(str);
        return value;
    }
}
