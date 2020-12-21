package HomeTask7DelendikRoman.MyJacket;

public class MyJacketPilot implements MyJacket{
    private int price;

    public MyJacketPilot(int price) {
        this.price = price;
    }

    @Override
    public void putOnJacket() {

    }

    @Override
    public void putOffJacket() {

    }

    @Override
    public int getPrice() {
        return price;
    }
}
