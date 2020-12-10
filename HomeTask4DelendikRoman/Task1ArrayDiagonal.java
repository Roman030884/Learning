package HomeTask4DelendikRoman;

import java.util.Random;
import java.util.Scanner;

public class Task1ArrayDiagonal {
    public static void main( String[]args ){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = scanner .nextInt();
        int y = scanner .nextInt();
        int [][] mass= new int [x][y];
        
        Random ron=new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = ron.nextInt(10);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        for ( int i = 0 ; i < mass.length; i++) {
            for ( int j = 0 ; j < mass[i].length; j++) {
                if (i == j) {
                    if (mass [i][j]%2==0) {
                        sum+=mass[i][j];
                    }
                    break;
                }
            }

        }
        System . out .print( "Сумма чисел главной диагонали ровна" + " "+sum);
    }
}
