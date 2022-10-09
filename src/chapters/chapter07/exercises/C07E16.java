package chapters.chapter07.exercises;

public class C07E16 {
    public static void main(String[] args) {
        final int LENGTH = 100000;
        int[] numbers = new int[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            numbers[i] = (int)(Math.random() * LENGTH);
        }
        int key = (int) (Math.random() * LENGTH);

        long startTime = System.currentTimeMillis();
        int indexOfLinearSearch = LinearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        System.out.println("The index of key is " + indexOfLinearSearch);
        System.out.println("The LinearSearch time is " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Sort(numbers);
        int indexOfBinarySearch = BinarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        System.out.println("The index of key is " + indexOfBinarySearch);
        System.out.println("The BinarySearch time is " + (endTime - startTime));
    }

    public static int LinearSearch(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i])
                return i;
        }
        return -1;
    }

    public static void Sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if(currentMin > array[j]){
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
    }

    public static int BinarySearch(int[] array, int num){
        int low = 0;
        int high = array.length - 1;
        while(high >= low){
            int mid = (low + high) / 2;
            if(num < array[mid])
                high = mid - 1;
            else if (num == array[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
