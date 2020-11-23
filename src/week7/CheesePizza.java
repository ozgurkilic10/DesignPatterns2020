package week7;



public class CheesePizza extends Pizza{


    public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createCheese());
    }

    @Override
    public void prepare() {
        System.out.println("NY Style Cheese Pizza is being prepared");
    }
}
