package week1;

public class Dog  extends Animal{
    int location;
    Mover mover = new Mover();

    public  void move(int distance){
        location = mover.move(location, distance);
    }
}
