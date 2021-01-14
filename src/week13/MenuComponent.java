package week13;

import java.util.Iterator;

public interface MenuComponent {
    void add(MenuComponent menuComponent);
    void remove(MenuComponent menuComponent);
    MenuComponent getChild(int i);

    String getName();
    String getDescription();
    double getPrice();
    boolean isVegetarian();

    void print();

    Iterator createIterator();
}
