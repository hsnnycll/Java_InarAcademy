package chapters.chapter06.exercises;

public class C06E08 {
    public static void main(String[] args) {
        System.out.println("Celsius     Fahrenheit      |      Fahrenheit       Celsius");
        System.out.println("------------------------------------------------------------------");

        double celsius = 40.0;
        double fahrenheit = 120.0;
        while (celsius >= 31.0 && fahrenheit >= 30.0) {
            System.out.printf("%.1f%14.1f", celsius, celsiusToFahrenheit(celsius));
            System.out.printf("\t\t\t|%14.1f%14.2f", fahrenheit, fahrenheitToCelsius(fahrenheit));
            System.out.println();
            celsius -= 1.0;
            fahrenheit -= 10.0;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
