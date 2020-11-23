package week6;

public class DependentPizzaStore {

    public Pizza orderPizza(String style, String type){

        Pizza pizza = null;
        if (style.equals("NY")){
            if (type.equals("cheese")){
                pizza = new NYStyleCheesePizza();
            }else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }else if (type.equals("veggi")) {
                pizza = new NYStyleVeggiePizza();
            }else{
                return null;
            }
        }else if (style.equals("Chicago")){
            if (type.equals("cheese")){
                pizza = new ChicagoStyleCheesePizza();
            }else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }else if (type.equals("veggi")) {
                pizza = new ChicagoStyleVeggiePizza();
            }else{
                return null;
            }
        }



        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
