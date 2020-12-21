package HomeTask8DelendikRoman;

public class Runner {
    public static void main(String[] args) {
        SpaceshipShuttle shuttle = new SpaceshipShuttle();
        Spaceport spaceport = new Spaceport();
        spaceport.launch(shuttle);
        System.out.println("================================");
        SpaceshipSpaсeX spaceX = new SpaceshipSpaсeX();
        spaceport.launch(spaceX);
    }
}
