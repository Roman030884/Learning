public class Task4 {
    public static void main (String []args ){
        int i=-10;
        int a=-3;
        int k=1;
        int negative = 0;
        int positive = 0;

        if (i<0) {negative++;}
        if (i>0) {positive++;}

        if (a<0){ negative++;}
        if (a>0){ positive++;}

        if (k<0){ negative++;}
        if (k>0){ positive++;}

        System.out.println( "Колличество отрицательных чисел равно" +" "+ negative);
        System.out.println( "Колличество положительных чисел равно" +" "+ positive);
    }
}

