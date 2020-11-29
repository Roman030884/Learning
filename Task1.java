public class Task1 {
    public static void main(String[] args) {
        int x = -8;
        if (x > 0) {
            x = x + 1;
            System.out.print(x);
        } else if (x < 0) {
            x = x -2;
            System.out.print(x);
        } else
            if (x == 0) {
            x=10;
            System.out.print(x);
        }
    }
}