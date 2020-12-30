package week12;

import java.util.Iterator;

public class Waitress {

    Menu[] menus;

    public Waitress(Menu... menus) {
        this.menus = menus;

    }

    public void printMenu(){

        for (Menu menu: menus) {
            System.out.println(menu.getName() + " Menu");
            //print elements
            printItems(menu.iterator());
            System.out.println("------------");
        }
    }

    public void printItems(Iterator<MenuItem> itr){

        while(itr.hasNext()){
            MenuItem item =  itr.next();
            System.out.print(item.getName() + " ");
            System.out.println(item.getDescription() + " ");
            System.out.println(item.getPrice() + " ");
        }
    }

    public void printVegetarianMenu(){

    }
}
