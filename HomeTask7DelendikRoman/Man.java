package HomeTask7DelendikRoman;

import HomeTask7DelendikRoman.MyBoots.MyBoots;
import HomeTask7DelendikRoman.MyPants.MyPants;
import HomeTask7DelendikRoman.MyJacket.MyJacket;

public class Man implements ActionMan{
    private String name;
    private MyBoots boots;
    private MyJacket jacket;
    private MyPants pants;

    public Man(String name, MyBoots boots, MyJacket jacket, MyPants pants) {
        this.name = name;
        this.boots = boots;
        this.jacket = jacket;
        this.pants = pants;
    }

    public MyBoots getBoots() {
        return boots;
    }

    public MyJacket getJacket() {
        return jacket;
    }

    public MyPants getPants() {
        return pants;
    }

    public String getName() {
        return name;
    }

    public void setBoots(MyBoots boots) {
        this.boots = boots;
    }

    public void setJacket(MyJacket jacket) {
        this.jacket = jacket;
    }

    public void setPants(MyPants pants) {
        this.pants = pants;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void putOnMan() {
        boots.putOnBoots();
        pants.putOnPants();
        jacket.putOnJacket();
        System.out.println("Man put on");
    }

    @Override
    public void putOffMan() {
        boots.putOffBoots();
        pants.putOffPants();
        jacket.putOnJacket();
        System.out.println("Man put off");
    }

    @Override
    public int getPrice() {
        int price=boots.getPrice()+pants.getPrice()+ jacket.getPrice();
        return price;
    }
}
