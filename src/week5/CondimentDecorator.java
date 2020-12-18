package week5;

public abstract class CondimentDecorator extends Beverage{
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " +" + description;
    }
}
