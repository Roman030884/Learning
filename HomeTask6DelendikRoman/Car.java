package HomeTask6DelendikRoman;

import java.util.Scanner;

public class Car extends GroundTransport {
    private String typeBody;
    private int numberOfPassengers;
    private final static double Z = 0.74;

    public Car(int numberOfWheels, int fuelConsumption, int power, int maxSpeed,
               int wight, String brand, String typeBody, int numberOfPassengers) {
        super(numberOfWheels, fuelConsumption, power, maxSpeed, wight, brand);
        this.numberOfPassengers = numberOfPassengers;
        this.typeBody = typeBody;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody() {
        this.typeBody = typeBody;
    }

    public void setNumberOfPassengers() {
        this.numberOfPassengers = numberOfPassengers;
    }

    public double powerCalculation() {
         return Z * getPower();
    }

    private double consumptionCalculation(double way) {
        return getFuelConsumption() * way / 100;
    }

    public void wayCalculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время нахождения в пути: ");
        double time = scanner.nextDouble();
        double way = getMaxSpeed() * time;
        System.out.println("За время" + " " + time + " " + "ч, автомобиль" + " " + getBrand() + " "
                + "двигаясь с максимальной скоростью" + " " + getMaxSpeed() + " " + "км/ч " +
                "проедет" + " " + way + "км и израсходует" + " " + consumptionCalculation(way) + " " + "литров топлива.");
    }

    @Override
    public String toString() {
        return "Car{" + "\n"+super.toString() +"\n"+
                "typeBody='" +"\n"+ typeBody +
                ", numberOfPassengers=" + numberOfPassengers +"\n"+
                ", powerKwt=" + powerCalculation() +"\n"+
                '}';
    }
}