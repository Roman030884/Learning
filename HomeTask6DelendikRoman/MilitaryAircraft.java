package HomeTask6DelendikRoman;

public class MilitaryAircraft extends Air {

    private int numberOfMissilesOnBoard;
    private boolean ejectionSystem;

    public MilitaryAircraft(int power, int maxSpeed, int wight, String brand,
                            int wingspan, int lengthOfRunway, int numberOfMissilesOnBoard,
                            boolean ejectionSystem) {
        super(power, maxSpeed, wight, brand, wingspan, lengthOfRunway);
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberOfMissilesOnBoard() {
        return numberOfMissilesOnBoard;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setNumberOfMissilesOnBoard(int numberOfMissilesOnBoard) {
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }
    public void chekSystem(){
        ejectionSystem=true;
        if (ejectionSystem){
            System.out.print("The ejection was successful");
        } else {
            System.out.print("You don't have such a system ");
        }
    }

    public void firingRockets() {
        int remainingMissiles = 12;
        if (remainingMissiles != 0) {
            System.out.print("Ракета пошла");
        } else {
            System.out.print("Боекомплект изриасходован");
        }

    }
    @Override
    public String toString() {
        return "MilitaryAircraft{" + super.toString() + "\n" +
                "numberOfMissilesOnBoard=" + numberOfMissilesOnBoard + "\n" +
                ", ejectionSystem=" + ejectionSystem + "\n" +
                '}';
    }
}
