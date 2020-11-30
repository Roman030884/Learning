import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число программистов");
        int numberProgrammers = scanner.nextInt();


        if (numberProgrammers % 10 == 1) {
            System.out.print(numberProgrammers + " " + "программист");
        }
        if (numberProgrammers % 10 == 2) {
            System.out.print(numberProgrammers + " " + "программиста");
        }
        if (numberProgrammers % 10 == 3) {
            System.out.print(numberProgrammers + " " + "программиста");
        }
        if (numberProgrammers % 10 == 4) {
            System.out.print(numberProgrammers + " " + "программиста");
        }
        if (numberProgrammers % 10 == 5) {
            System.out.print(numberProgrammers + " " + "программистов");
        }
        if (numberProgrammers % 10 == 6) {
            System.out.print(numberProgrammers + " " + "программистов");
        }
        if (numberProgrammers % 10 == 7) {
            System.out.print(numberProgrammers + " " + "программистов");
        }
        if (numberProgrammers % 10 == 8) {
            System.out.print(numberProgrammers + " " + "программистов");
        }
        if (numberProgrammers % 10 == 9) {
            System.out.print(numberProgrammers + " " + "программистов");
        }
        if (numberProgrammers % 10 == 0) {
            System.out.print(numberProgrammers + " " + "программистов");
        }

        if (numberProgrammers <0) {
            System.out.print("Вы ввели отрицательное число");
        }
    }

}