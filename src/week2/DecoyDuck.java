package week2;

public class DecoyDuck extends Duck{

    public DecoyDuck() {

        flyBehaviour = new NoFly();
        quackBehaviour = new NoQuack();
    }

    @Override
    public void display() {
        System.out.println("Decoy Duck");
    }


}
