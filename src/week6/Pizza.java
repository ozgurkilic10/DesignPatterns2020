package week6;

import java.util.List;

public abstract class  Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;


    public abstract void prepare();

    public void bake(){
        System.out.println("Pizza is being baked");
    }

    public void cut(){
        System.out.println("Pizza is being cut");
    }

    public void box(){
        System.out.println("Pizza is being boxed");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    public String getName() {
        return name;
    }
}
