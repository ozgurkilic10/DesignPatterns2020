package week13;

import java.util.Iterator;

public class MenuItem implements MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException(" Can not add child to a Menu Item");
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException(" Can not remove  a child from a Menu Item");
    }

    @Override
    public MenuComponent getChild(int i) {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.print(getName() );
        if(isVegetarian())
            System.out.print(" (v)");
        System.out.println(", " + getPrice());
        System.out.println(getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
