import java.nio.CharBuffer;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int numbers=scanner.nextInt();
        int countOfNumber=0;

        if (numbers>0){
            System.out.println("Это положительное число");
        }
        if (numbers<0){
            System.out.println("Это отрицательное число");
        }

        for ( ; numbers != 0 ;numbers  /= 10)
            ++countOfNumber;
        System.out.println("Которое состоит из"+" "+countOfNumber+" "+"цифр");}


    }
