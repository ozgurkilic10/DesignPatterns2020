package week11;

public class Tea extends CaffeineBeverage{



    /*public  void prepareRecipe(){
        System.out.println("Algorithm overridden");
    }*/

    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }


    protected void brew() {
        System.out.println("Steeping Tea Bag");
    }

   /* protected void pourInCup() {
        System.out.println("Pouring in to the Cup in a different way");
    }*/


   protected void hook(){
       System.out.println(" A step");
       System.out.println(" Another step");
   }
}
