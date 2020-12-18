package week5;

public class Milk extends CondimentDecorator{


    public Milk(Beverage beverage) {
        super(beverage);
        description = "Milk";
    }

    @Override
    public int cost() {
        return 1 + beverage.cost();
    }


}
