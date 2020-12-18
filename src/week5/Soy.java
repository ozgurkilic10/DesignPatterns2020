package week5;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage) {
        super(beverage);
        description = "Soy";
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
}
