package weeks.week_14;

public class Bus extends Vehicle{

    private int passengerSeat;

    public Bus() {
        super();
    }

    public Bus(String brand, String model, int wheels, int year, String color, boolean hasSunRoof, boolean hasInsurance, boolean running, int passengerSeat) {
        this.passengerSeat = passengerSeat;
    }

    public int getPassengerSeat() {
        return passengerSeat;
    }

    public void setPassengerSeat(int passengerSeat) {
        this.passengerSeat = passengerSeat;
    }

    @Override
    public String toString(){
        return (super.toString() + "PassengerSeat: " + this.passengerSeat);
    }
}
