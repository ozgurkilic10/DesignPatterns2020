package week13;


import java.util.Iterator;

public class Waitress {

    MenuComponent topMenu;

    public Waitress(MenuComponent topMenu) {
        this.topMenu = topMenu;

    }

    public void printMenu(){

        topMenu.print();
    }

    public  void printVegetarianItems(){
        Iterator iterator = topMenu.createIterator();
        System.out.println("Vegetarian Menu");
        while(iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            if (menuComponent instanceof MenuItem)
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }

        }
    }

}
