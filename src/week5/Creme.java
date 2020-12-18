package week5;

public class Creme extends CondimentDecorator{
    public Creme(Beverage beverage) {
        super(beverage);
        description = "Creme";
    }

    @Override
    public int cost() {
        return 5 + beverage.cost();
    }
}
