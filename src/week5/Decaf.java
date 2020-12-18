package week5;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public int cost() {
        return 4;
    }
}
