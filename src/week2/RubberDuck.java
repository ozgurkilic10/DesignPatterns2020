package week2;

public class RubberDuck extends Duck{
    public RubberDuck() {

        flyBehaviour = new NoFly();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }


}
