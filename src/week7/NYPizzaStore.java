package week7;


public class NYPizzaStore extends PizzaStore{

    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    public void scheduleDelivery(){
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza("NY Style Cheese", ingredientFactory);
        }else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza("NY Style Pepperoni", ingredientFactory);
        }else if (type.equals("veggi")) {
            pizza = new VeggiePizza("NY Style Veggie", ingredientFactory);
        }else{
            return null;
        }
        return pizza;
    }
}
