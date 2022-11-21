package chapters.chapter12.exercises.C12E01;

public class C12E01 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        try {
            Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Value: " + args[0]);
            System.exit(1);
        }
        try {
            Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Value: " + args[2]);
            System.exit(2);
        }

        int result = 0;
        switch (args[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
