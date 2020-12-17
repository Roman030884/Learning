package HomeTask6DelendikRoman;

public class Transport {
    private double power;
    private int maxSpeed;
    private int wight;
    private String brand;

    public Transport(int power, int maxSpeed, int wight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.wight = wight;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWight() {
        return wight;
    }

    public void setPower() {
        this.power = power;
    }

    public void setMaxSpeed() {
        this.maxSpeed = maxSpeed;
    }

    public void setWight() {
        this.wight = wight;
    }

    public void setBrand() {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +"\n"+
                ", maxSpeed=" + maxSpeed +"\n"+
                ", wight=" + wight +"\n"+
                ", brand='" + brand + '\'' +
                '}';
    }
}
