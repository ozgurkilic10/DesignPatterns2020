package week5;

import java.util.ArrayList;
import java.util.List;

public class StarBuzz {

    public static void main(String... args){

        List<Beverage>  order = new ArrayList<>();
        order.add(new DarkRoast());
        order.add(new Milk(new HouseBlend()));
        order.add(new Mocha(new Mocha(new Espresso())));
        order.add(new Creme(new DarkRoast()));


        Beverage bev1 = new DarkRoast();

        System.out.println(bev1.cost());

        bev1 = new Mocha(bev1);

        System.out.println(bev1.cost());



        int total = 0;
        for(Beverage bev : order){
            System.out.println(bev.getDescription() + " " + bev.cost() + " TL ");
            total += bev.cost();
        }

        System.out.println(total);
    }
}
