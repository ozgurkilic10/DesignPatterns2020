package week2;

public class Main {

    public static void main(String... args){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();

        //mallard duck was shooted
        mallardDuck.setFlyBehaviour(new NoFly());
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.swim();

        redHeadDuck.performFly();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();

        DecoyDuck decoyDcuk = new DecoyDuck();
        decoyDcuk.display();
        decoyDcuk.performQuack();
        decoyDcuk.swim();
        decoyDcuk.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.performFly();

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
