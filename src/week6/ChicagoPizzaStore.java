package week6;

public class ChicagoPizzaStore extends PizzaStore{


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }else if (type.equals("veggi")) {
            pizza = new ChicagoStyleVeggiePizza();
        }else{
            return null;
        }
        return pizza;
    }
}
