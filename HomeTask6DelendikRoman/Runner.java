package HomeTask6DelendikRoman;

public class Runner {
    public static void main(String[] args) {
        Car volvoXC90 = new Car(4, 15,
                250, 280, 3, "Volvo", "coupe", 5);
        volvoXC90.wayCalculate();
        System.out.println(volvoXC90.toString());

        System.out.println("=================================================");

        Lorry scaniaFx450 = new Lorry(12, 16, 450, 160,
                11, "Scania FX450", 22, 10, 3,
                4);
        scaniaFx450.loading();
        System.out.print(scaniaFx450.toString());

        System.out.println("=================================================");
        CivilianAircraft boeing = new CivilianAircraft(20, 950, 2500,
                "Boeing747", 1500, 2000, 400,
                true);
        boeing.loadPassenger();
        boeing.isAvailabilityOfBusinessClass();
        System.out.println(boeing.toString());

        System.out.println("=================================================");
         MilitaryAircraft su=new MilitaryAircraft(2700,2600,5,"Su 35",
                 15,500,28,true);
         su.firingRockets();
        System.out.println(su.toString());

    }
}