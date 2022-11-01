package chapters.chapter09.exercises.C09E02;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        double difference = currentPrice - previousClosingPrice;
        return (difference / previousClosingPrice) * 100;
    }
}
