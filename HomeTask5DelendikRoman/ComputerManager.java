package HomeTask5DelendikRoman;

import java.util.Scanner;

public class ComputerManager {

    private final static String CPU = "Intel";
    private final static String RAM = "DDR4 Kingstone";
    private final static String HARD_DISK = "SSD WD";

    public static void main(String[] args) {
        Computer computer = new Computer(CPU, RAM, HARD_DISK);
        System.out.println(computer.toString());
        int controller = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            console();
            controller = scanner.nextInt();
            int code;
            switch (controller) {
                case (1):
                    code = computer.powerOn();
                    controller = checkCode(code);
                    break;
                case (2):
                    code = computer.powerOff();
                    controller = checkCode(code);
                    break;
                case (0):
                    System.out.println("Program finished");
                    break;
                default:
                    System.out.println("Program continue work");
            }
        } while (((controller != 0) & (computer.getCurrentResource() != 0)));
        if (computer.getCurrentResource() == 0) {
            System.out.println("Resource depleted. Computer died !!!");
        }
    }

    private static void console() {
        System.out.println("1 : Power ON");
        System.out.println("2 : Power OFF");
        System.out.println("0 : Logout");
        System.out.print(":> ");
    }

    private static int checkCode(int code) {
        int randomCode;
        if (Math.random() < 0.5) {
            randomCode = 0;
        } else {
            randomCode = 1;
        }
        if (randomCode != code) {
            System.out.println("Computer died!!!!!");
            return 0;
        }
        return 5;
    }
}