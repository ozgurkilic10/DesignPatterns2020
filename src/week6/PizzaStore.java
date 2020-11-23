package week6;

public abstract class PizzaStore {


    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);
        if (pizza == null) return null;


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
