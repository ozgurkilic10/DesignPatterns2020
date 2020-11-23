package week7;


public class ChicagoPizzaStore extends PizzaStore{


    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    public void scheduleDelivery(){
        System.out.println("delivery is schedule");
    }


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza("Chicago Style Cheese", ingredientFactory);
        }else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza("Chicago Style Pepperoni", ingredientFactory);
        }else if (type.equals("veggi")) {
            pizza = new VeggiePizza("Chicago Style Veggie", ingredientFactory);
        }else{
            return null;
        }
        return pizza;
    }
}
