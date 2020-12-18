package week11;

public abstract class CaffeineBeverage {

    public  final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();

    }

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected final void pourInCup() {
        System.out.println("Pouring in a Cup");
    }

    protected final void boilWater() {
        System.out.println("Boiling the water");
    }


    protected abstract void addCondiments();


    protected abstract void brew();
}
