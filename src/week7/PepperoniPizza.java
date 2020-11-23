package week7;



public class PepperoniPizza extends Pizza{

    public PepperoniPizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createCheese());
    }
    @Override
    public void prepare() {
        System.out.println("Pepperoni Pizza is being prepared");
    }
}
