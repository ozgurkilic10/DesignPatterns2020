package week6;

public class TestPizzaStore {

    public static void main(String... args){
        //SimplePizzaFactory factory = new SimplePizzaFactory();

        //PizzaStore ps = new PizzaStore(factory);

        //ps.orderPizza("cheese");


        NYPizzaStore nps = new NYPizzaStore();

        nps.orderPizza("cheese");


        ChicagoPizzaStore cps = new ChicagoPizzaStore();

        cps.orderPizza("cheese");

    }
}
