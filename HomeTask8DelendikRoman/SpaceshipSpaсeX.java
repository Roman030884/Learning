package HomeTask8DelendikRoman;

import HomeTask8DelendikRoman.IStart.IStart;

import java.util.Random;

public class SpaceshipSpaсeX implements IStart {

    @Override
    public boolean checkingSystem() {
        Random ron = new Random();
        int a = ron.nextInt(10);
        if (a < 3) {
            System.out.println("the test is successful");
            return true;
        } else {
            System.out.println("Bad things happened");
            return false;
        }
    }

    @Override
    public void startEngine() {

        System.out.println("The shuttle's engines are running. All systems are normal.");

    }

    @Override
    public void start() {
        System.out.println("Start The Shuttle");
    }
}
