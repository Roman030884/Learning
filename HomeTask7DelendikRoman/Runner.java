package HomeTask7DelendikRoman;

import HomeTask7DelendikRoman.MyBoots.MyBoots;
import HomeTask7DelendikRoman.MyBoots.MyBootsGeox;
import HomeTask7DelendikRoman.MyBoots.MyBootsMarko;
import HomeTask7DelendikRoman.MyBoots.MyBootsMilitary;
import HomeTask7DelendikRoman.MyJacket.MyJacketMilitary;
import HomeTask7DelendikRoman.MyPants.MyPants;
import HomeTask7DelendikRoman.MyPants.MyPantsCivil;
import HomeTask7DelendikRoman.MyJacket.MyJacket;
import HomeTask7DelendikRoman.MyJacket.MyJacketAlaska;
import HomeTask7DelendikRoman.MyJacket.MyJacketPilot;
import HomeTask7DelendikRoman.MyPants.MyPantsMilitary;
import HomeTask7DelendikRoman.MyPants.MyPantsSport;

public class Runner {
    public static void main(String[] args) {
        MyBoots geox=new MyBootsGeox(160);
        MyPants civil=new MyPantsCivil(140);
        MyJacket alaska = new MyJacketAlaska(380);

        Man tony = new Man("Tony",geox,alaska,civil);
        tony.getPrice();
        tony.putOnMan();
        tony.putOffMan();
        System.out.println("Cost of a set of clothes"+" "+tony.getPrice());

        System.out.println("===================================");

        MyBoots marko=new MyBootsMarko(130);
        MyJacket pilot=new MyJacketPilot(156);
        MyPants sport=new MyPantsSport(140);

        Man jim=new Man("Jim",marko,pilot,sport);
        jim.getPrice();
        jim.putOnMan();
        jim.putOffMan();
        System.out.println("Cost of a set of clothes"+" "+jim.getPrice());

        System.out.println("===================================");

        MyBoots militaryBoots=new MyBootsMilitary(180);
        MyJacket militaryJacket=new MyJacketMilitary(250);
        MyPants militaryPants=new MyPantsMilitary(235);

        Man bin=new Man("Bin",militaryBoots,militaryJacket,militaryPants);
        bin.getPrice();
        bin.putOnMan();
        bin.putOffMan();

        System.out.println("Cost of a set of clothes"+" "+bin.getPrice());
    }
}