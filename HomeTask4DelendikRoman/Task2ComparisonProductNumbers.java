package HomeTask4DelendikRoman;

import java.util.Random;
import java.util.Scanner;

public class Task2ComparisonProductNumbers {
    public static void main( String[]args ){
        int product1 = 1;
        int product2 = 1;
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

        for ( int i = 0 ; i < mass.length; i++) {
            for ( int j = 0 ; j < mass[i].length; j++) {
                if (i == j) {
                    if ( mass[i][j]>=0){
                    product1*=mass[i][j];

                    }
                    break;
                }
             }
        }
        System . out .print( "Произведение чисел главной диагонали ровна" + " "+product1);

        for ( int i = 0 ; i < mass. length ; i++) {
            for ( int j = 0 ; j <mass [i]. length ; j++) {
                if (i ==mass [i]. length - j - 1 ) {
                    if ( mass [i][j]>=0) {
                        product2 *=mass[i][j];
                    }
                    break;
                }
            }
        }
        System.out.println();
        System . out .println( "Произведение элементов на побочной диагонали ровна" + product2);
        System.out.println();
        if (product1>product2) {
            System.out.println( "Произведениме главной диагонали больше произведение побочной диагонали");
        } else if (product1<product2){
            System.out.println("Произведениме главной диагонали больше произведение побочной диагонали");
        } else if (product2==product2){
            System.out.println( "Произведениме главной диагонали равно произведению побочной диагонали");
        }
    }
}

