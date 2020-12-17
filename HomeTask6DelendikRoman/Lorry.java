package HomeTask6DelendikRoman;

import java.util.Scanner;

public class Lorry extends GroundTransport {
    private int carrying;
    private double lengthOfBodywork;
    private double widthOfBodywork;
    private double heightOfBodywork;

    public Lorry(int numberOfWheels, int fuelConsumption, int power, int maxSpeed, int wight,
                 String brand, int carrying,double lengthOfBodywork,double widthOfBodywork,
                 double heightOfBodywork ) {
        super(numberOfWheels, fuelConsumption, power, maxSpeed, wight, brand);
        this.carrying = carrying;
        this.lengthOfBodywork=lengthOfBodywork;
        this.widthOfBodywork=widthOfBodywork;
        this.heightOfBodywork=heightOfBodywork;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public double getLengthOfBodywork() {
        return lengthOfBodywork;
    }

    public double getWidthOfBodywork() {
        return widthOfBodywork;
    }

    public double getHeightOfBodywork() {
        return heightOfBodywork;
    }


    public void loading(){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Введите вес грузва"+" ");
        double weightOfCargo=scanner.nextDouble();
        System.out.print("Введите длинну груза"+" ");
        double lengthOfCargo =scanner.nextDouble();
        System.out.print("Введите ширину груза"+" ");
        double widthOfCargo=scanner.nextDouble();
        System.out.print("Введите высоту груза"+" ");
        double heightOfCargo =scanner.nextDouble();

        if ((weightOfCargo<=getCarrying())&&
                (lengthOfCargo<=getLengthOfBodywork())&&
                (weightOfCargo<=getWidthOfBodywork())&&
                (heightOfCargo<=getHeightOfBodywork())){
            System.out.println("Cargo transportation order accepted");
        } else {
            System.out.print("you need a bigger truck");
        }

    }

    public void setLengthOfBodywork(double lengthOfBodywork) {
        this.lengthOfBodywork = lengthOfBodywork;
    }

    public void setWidthOfBodywork(double widthOfBodywork) {
        this.widthOfBodywork = widthOfBodywork;
    }

    public void setHeightOfBodywork(double heightOfBodywork) {
        this.heightOfBodywork = heightOfBodywork;
    }

    @Override
    public String toString() {
        return "Lorry{"  +super.toString()+"\n"+
                "carrying="+ carrying +"\n"+
                '}';
    }
}
