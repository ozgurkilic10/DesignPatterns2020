package week7;



public class VeggiePizza extends Pizza{


    public VeggiePizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createCheese());
    }
    @Override
    public void prepare() {
        System.out.println("NY Style Veggie Pizza is being prepared");
    }
}
