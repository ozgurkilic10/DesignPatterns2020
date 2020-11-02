package week2;

public class RedHeadDuck extends Duck  {
    public RedHeadDuck() {

        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }


}
