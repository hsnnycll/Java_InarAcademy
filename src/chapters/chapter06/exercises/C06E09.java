package chapters.chapter06.exercises;

public class C06E09 {
    public static void main(String[] args) {
        System.out.println("Feet         Meters     |       Meters       Feet");
        System.out.println("-----------------------------------------------------");

        double feet = 1.0;
        double meters = 20.0;
        while (feet <= 10.0 && meters <= 65.0) {
            System.out.printf("%2.1f%15.3f",feet , footToMeter(feet));
            System.out.printf("\t\t|\t\t%2.1f%15.3f", meters , meterToFoot(meters));
            System.out.println();
            feet += 1.0;
            meters += 5.0;
        }
    }

    public static double footToMeter(double feet) {
        return (0.305 * feet);
    }

    public static double meterToFoot(double meters) {
        return (3.279 * meters);
    }
}
