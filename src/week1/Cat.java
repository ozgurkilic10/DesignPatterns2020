package week1;

public class Cat extends Animal{

   Mover mover = new Mover();
   public  void move(int distance){
       location = mover.move(location, distance);
   }
}
