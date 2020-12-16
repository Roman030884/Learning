package HomeTask5DelendikRoman;

import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String hardDisk;
    private int currentResource;
    private final static int RESOURCE = 3;


    public Computer(String cpu, String ram, String hardDisk) {
        this.cpu = cpu;
        this.ram = ram;
        this.hardDisk = hardDisk;
        currentResource = RESOURCE;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getCurrentResource() {
        return currentResource;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", Resource='" + RESOURCE + '\'' +
                '}';
    }

    int powerOn() {
        System.out.println("Power ON in processing");
        return receiveCode();
    }

    int powerOff() {
        System.out.println("Power OFF in processing");
        currentResource--;
        return receiveCode();
    }

    private int receiveCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number :> ");
        return scanner.nextInt();
    }

}