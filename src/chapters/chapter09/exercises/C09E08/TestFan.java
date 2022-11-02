package chapters.chapter09.exercises.C09E08;

public class TestFan {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(Fan.SLOW);
        fan1.setRadius(10);
        fan1.setColor("YELLOW");
        System.out.println(fan1);

        System.out.println("------");

        Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "BLUE");
        System.out.println(fan2);

    }
}
