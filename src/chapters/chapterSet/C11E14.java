package chapters.chapterSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C11E14 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        getSet(set1);
        getSet(set2);

        Set<Integer> combinedSet = union(set1, set2);
        System.out.print("The combined set is ");
        for (Integer i : combinedSet) {
            System.out.print(i + " ");
        }

    }

    public static void getSet(Set<Integer> set) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter five integers for set: ");
        for (int i = 0; i < 5; i++) {
            set.add(input.nextInt());
        }
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setCombined = new HashSet<>();
        for (Integer i : set1) {
            setCombined.add(i);
        }
        for (Integer i : set2) {
            setCombined.add(i);
        }

        return setCombined;
    }
}
