package chapters.chapter10.exercises.C10E25;

public class SplitMethod {
    public static void main(String[] args) {

        String s = "ab#12#453#58#89#";
        String[] result = split(s, "#");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] split(String s, String regex) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < regex.length(); j++) {
                if (s.charAt(i) == regex.charAt(j)) {
                    count++;
                }
            }
        }
        String[] array = new String[2 * count + 1];
        String str = "";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == regex.charAt(0))) {
                str += s.charAt(i);
            } else {
                array[index] = str;
                index++;
                array[index] = regex;
                index++;
                str = "";
            }
        }
        array[index] = str;
        return array;
    }
}

