package chapters.chapter06.exercises;

import java.util.Scanner;

public class C06E31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    public static boolean isValid(long number) {
        boolean isValid = true;
        if (!(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 37))) {
            return !(isValid);
        }
        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {
            return !(isValid);
        }
        return isValid;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        int size = getSize(number);
        for (int i = 2; i <= size; i += 2) {
            int d = (int) ((number % Math.pow(10, i)) / Math.pow(10, i - 1) * 2);
            d = getDigit(d);
            sum += d;
        }
        return sum;
    }

    public static int getDigit(int number){
        int size = getSize(number);
        if(size >= 2){
            int sum = 0;
            for (int i = 0; i < size; i++){
                int d = (int) ((number / Math.pow(10, i)) % 10);
                sum += d;
                return sum;
            }
        }
        return number;
    }

    public static int sumOfOddPlace(long number){
        int sum = 0;
        int size = getSize(number);
        for (int i = 1; i < size; i += 2) {
            int d = (int) ((number % Math.pow(10, i)) / (Math.pow(10, i - 1)));
            sum += d;
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d){
        long firstDigit = getPrefix(number, 1);
        long firstTwoDigits = getPrefix(number, 2);
        if (firstDigit == d || firstTwoDigits == d){
            return true;
        }else {
            return false;
        }
    }

    public static int getSize(long d){
        int count = 0;
        while (d != 0){
            d /= 10;
            count++;
        }
        return count;
    }

    public static long getPrefix(long number, int k){
        if(k >= getSize(number)){
            return number;
        }else {
            long kDigit = (long) (number / Math.pow(10, getSize(number) - k));
            return kDigit;
        }
    }
}
