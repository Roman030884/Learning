package HomeTask8DelendikRoman;


import HomeTask8DelendikRoman.IStart.IStart;

public class Spaceport {

    void launch(IStart iStart) {
        if (iStart.checkingSystem()) {
            System.out.println("Back count");
            for (int i = 10; i >=0 ; i--) {
                System.out.println(i);
            }
            iStart.startEngine();
            iStart.start();
        }
    }
}
