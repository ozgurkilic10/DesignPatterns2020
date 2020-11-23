package week6;

public class NYPizzaStore extends PizzaStore{



    public void scheduleDelivery(){
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
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
