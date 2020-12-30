package week12;


import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 2;
    private  MenuItem[] menuItems = new MenuItem[MAX_ITEMS];
    int itemCount;


    public DinerMenu(){
        addItem("Soup","tomato",true,3);
        addItem("Hotdog","Meat, Onion",false,5);
        addItem("Hotdog","Meat, Onion",false,5);
    }


    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);

        if (itemCount>= MAX_ITEMS){
            return;
        }
        menuItems[itemCount] = item;
        itemCount++;

    }


    public Iterator<MenuItem> iterator() {
        return new DinerMenuIterator<MenuItem>();
    }

    @Override
    public String getName() {
        return "Lunch";
    }

    public class DinerMenuIterator<T> implements Iterator<MenuItem>{

        int position =0;

        @Override
        public boolean hasNext() {
            if((position >= menuItems.length) || menuItems[position] == null)
                return false;
            return true;
        }

        @Override
        public MenuItem next() {
            MenuItem item = menuItems[position];
            position++;
            return item;
        }
    }
}
