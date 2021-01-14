package week13;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements MenuComponent{
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException(" Can not return a price for Menu");
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException(" Can not return a vegetarian state for Menu");
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getDescription());
        System.out.println("-----------------");
        Iterator<MenuComponent> itr = menuComponents.iterator();
        while (((Iterator) itr).hasNext()){
            MenuComponent mc =  itr.next();
            mc.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
