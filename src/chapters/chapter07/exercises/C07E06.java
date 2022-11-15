package chapters.chapter07.exercises;

public class C07E06 {
    public static boolean isPrime(int[] array, int count, int number) {
        for (int i = 0; i < count; i++) {
            if(array[i] <= Math.sqrt(number)) {
                if (number % array[i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int number = 2;
        int count = 0;

        while(count < primeNumbers.length){
            if(isPrime(primeNumbers,count, number)){
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }

        System.out.println("The first 50 prime number are: ");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%4d", primeNumbers[i]);
            if ((i + 1) % 10 == 0) System.out.println("");
        }
    }
}

