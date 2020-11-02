package week2;

public class ModelDuck extends Duck{

    public ModelDuck() {

        flyBehaviour = new NoFly();
        quackBehaviour = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }


}
