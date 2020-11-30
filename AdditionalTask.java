import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число программистов");
        int numberProgrammers = scanner.nextInt();

        if (numberProgrammers == 0) {
            System.out.print(numberProgrammers + " " + "программистов");
        } else if (numberProgrammers == 1) {
            System.out.print(numberProgrammers + " " + "программист");
        } else if (numberProgrammers == 2) {
            System.out.print(numberProgrammers + " " + "программиста");
        } else if (numberProgrammers == 3) {
            System.out.print(numberProgrammers + " " + "программиста");
        } else if (numberProgrammers == 4) {
            System.out.print(numberProgrammers + " " + "программиста");
        } else if (numberProgrammers > 4) {
            System.out.print(numberProgrammers + " " + "программистов");
        } else if (numberProgrammers <0 ) {
            System.out.print("Вы ввели отрицательное число");
        }

    }
}