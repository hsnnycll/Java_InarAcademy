package chapters.chapter07.exercises;

import java.util.Scanner;

public class C07E14 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter five numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The gcd of these numbers is " + gcd(numbers));
    }

    public static int gcd(int... numbers){
        int k = 1;
        boolean isDivisor;
        int gcd = 0;
        while (k <= min(numbers)){
            isDivisor = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % k != 0){
                    isDivisor = false;
                    k++;
                    break;
                }
            }
            if (isDivisor){
                gcd = k;
                k++;
            }
        }
        return gcd;
    }

    public static int min(int... numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
}
