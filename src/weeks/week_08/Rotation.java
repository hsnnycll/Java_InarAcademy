package weeks.week_08;

import java.util.Scanner;

public class Rotation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        boolean result = isRotationToOneAnother(s1, s2, false);
        System.out.println(result);

    }

    public static boolean isRotationToOneAnother(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String s3 = s1 + s1;
        return s3.contains(s2);
    }

    public static boolean isRotationToOneAnother(String s1, String s2, boolean isRotation){
        if(s1.length() != s2.length()) {
            return false;
        }
        int size = s1.length();
        for (int i = 0; i < size; i++) {
            if (s2.equals(rotation(s1, i))) {
                return true;
            }
        }
        return false;
    }

    public static String rotation(String s1, int i){
        String s3 = "";
        for (int j = i; j <s1.length() ; j++) {
            s3 += s1.charAt(j);
        }
        for (int j = 0; j < i; j++) {
            s3 +=s1.charAt(j);
        }
        return s3;
    }
}
