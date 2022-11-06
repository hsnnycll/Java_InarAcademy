package weeks.week_13;

public class Home {

    private double area;
    private int numberOfBath;
    private int getNumberOfRoom;
    private boolean hasGarage;
    private double fee;
    private double rentalFee;
    private String facade;
    private int year;

    public Home() {
        this(0, 0, 0, false, 0, 0, "East", 2000);
    }

    public Home(double area, int numberOfBath, int getNumberOfRoom, boolean hasGarage, double fee, double rentalFee, String facade, int year) {
        this.area = area;
        this.numberOfBath = numberOfBath;
        this.getNumberOfRoom = getNumberOfRoom;
        this.hasGarage = hasGarage;
        this.fee = fee;
        this.rentalFee = rentalFee;
        this.facade = facade;
        this.year = year;
    }

    public double getArea() {
        return area;
    }

    public int getNumberOfBath() {
        return numberOfBath;
    }

    public int getGetNumberOfRoom() {
        return getNumberOfRoom;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public double getFee() {
        return fee;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public String getFacade() {
        return facade;
    }

    public int getYear() {
        return year;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public void setGetNumberOfRoom(int getNumberOfRoom) {
        this.getNumberOfRoom = getNumberOfRoom;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public void setFacade(String facade) {
        this.facade = facade;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print(){
        System.out.println("Area: " + this.area);
        System.out.println("The number of bath: " + this.numberOfBath);
        System.out.println("The number of room: " + this.getNumberOfRoom);
        System.out.println("Does it have a garage?: " + (this.hasGarage ? "Has a Garage." : "Has no Garage."));
        System.out.println("What is the price?: " + this.fee);
        System.out.println("How much is the rent?: " + this.rentalFee);
        System.out.println("The facade of the house is " + this.facade);
        System.out.println("The date of the construction: " + this.year);
    }
}
