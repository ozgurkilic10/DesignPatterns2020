package week6;

public class NYSimplePizzaFactory extends SimplePizzaFactory{

    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }else if (type.equals("veggi")) {
            pizza = new NYStyleVeggiePizza();
        }else{
            return null;
        }
        return pizza;
    }
}
