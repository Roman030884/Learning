package HomeTask6DelendikRoman;

public class Air extends Transport{

    private int wingspan;
    private int lengthOfRunway;

    public Air(int power, int maxSpeed, int wight, String brand,  int wingspan, int lengthOfRunway) {
        super(power, maxSpeed, wight, brand);
        this.wingspan=wingspan;
        this.lengthOfRunway=lengthOfRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getLengthOfRunway() {
        return lengthOfRunway;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public void setLengthOfRunway(int lengthOfRunway) {
        this.lengthOfRunway = lengthOfRunway;
    }

    @Override
    public String toString() {
        return "Air{" + super.toString()+"\n"+
                "wingspan=" + wingspan +"\n"+
                ", lengthOfRunway=" + lengthOfRunway +
                '}';
    }
}
