package week13;


public class TestWaitress {

    public static void main(String... args){

        MenuComponent pancakeHouseMenu = new Menu("Breakfast", " Breakfast Description");
        pancakeHouseMenu.add(new MenuItem("Breakfast","Egg, Cheese, Tea",false,3));
        pancakeHouseMenu.add(new MenuItem("Waffles","Chocolate, Banana",true,5));

        MenuComponent dinerMenu = new Menu("Diner Menu", "Diner Menu Description");
        dinerMenu.add(new MenuItem("Soup","tomato",true,3));
        dinerMenu.add(new MenuItem("Hotdog","Meat, Onion",false,5));
        dinerMenu.add(new MenuItem("Hotdog","Meat, Onion",false,5));

        MenuComponent dessertMenu = new Menu("Dessert Menu", "Dessert Menu Description");
        dessertMenu.add(new MenuItem("Baklava","wallnut",true,7));
        dessertMenu.add(new MenuItem("Puding","milk",true,7));

        dinerMenu.add(dessertMenu);

        MenuComponent topMenu = new Menu("Top Menu","");
        topMenu.add(pancakeHouseMenu);
        topMenu.add(dinerMenu);

        Waitress w = new Waitress(topMenu);
        w.printMenu();
        w.printVegetarianItems();
    }
}
