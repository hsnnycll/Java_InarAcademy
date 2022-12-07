package chapters.chapter09.exercises.C09E02;

public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL", "Oracle Corporation", 34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("The price-change percentage is " + stock1.getChangePercent());
    }
}
