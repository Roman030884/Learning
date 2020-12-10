package HomeTask4DelendikRoman;

import java.util.Random;
import java.util.Scanner;

public class Task5transpositionMass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] mass = new int[x][y];


        Random ron = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = ron.nextInt(10);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = i + 1; j < mass[i].length; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
            }
        }
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("------");

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

    }
}


