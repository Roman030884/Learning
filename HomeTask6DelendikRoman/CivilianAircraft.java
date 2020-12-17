package HomeTask6DelendikRoman;

import java.util.Scanner;

public class CivilianAircraft extends Air {

    private int capacityOfAircraft;
    private boolean availabilityOfBusinessClass;


    public CivilianAircraft(int power, int maxSpeed, int wight, String brand, int wingspan,
                            int lengthOfRunway, int capacityOfAircraft,
                            boolean availabilityOfBusinessClass) {
        super(power, maxSpeed, wight, brand, wingspan, lengthOfRunway);
        this.capacityOfAircraft = capacityOfAircraft;
        this.availabilityOfBusinessClass = availabilityOfBusinessClass;
    }

    public int getNumberОfPassengers() {
        return capacityOfAircraft;
    }

    public boolean isAvailabilityOfBusinessClass() {
        return availabilityOfBusinessClass;
    }

    public void setCapacityOfAircraft(int capacityOfAircraft) {
        this.capacityOfAircraft = capacityOfAircraft;
    }

    public void loadPassenger() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число пассажиров" + " ");
        int numberOfPassengers = scanner.nextInt();

        if (numberOfPassengers <= capacityOfAircraft) {
            System.out.println("Welcome to the Board!");
        } else {
            System.out.print("The capacity of the aircraft is insufficient");
        }
    }

    @Override
    public String toString() {
        return "CivilianAircraft{" +super.toString()+"\n"+
                "capacityOfAircraft=" + capacityOfAircraft +"\n"+
                ", availabilityOfBusinessClass=" + availabilityOfBusinessClass +"\n"+
                '}';
    }
}