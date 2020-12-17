package HomeTask6DelendikRoman;

public class GroundTransport extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;


    public GroundTransport(int numberOfWheels, int fuelConsumption,
                           int power, int maxSpeed, int wight, String brand) {
        super(power, maxSpeed, wight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getFuelConsumption() {
        return numberOfWheels;
    }

    @Override
    public String toString() {
        return "GroundTransport{" + super.toString() +"\n"+
                "numberOfWheels=" + numberOfWheels +"\n"+
                ", fuelConsumption=" + fuelConsumption +"\n"+
                '}';
    }
}
