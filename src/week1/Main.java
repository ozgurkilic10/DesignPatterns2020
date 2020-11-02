package week1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String... args){
        System.out.println("hello");

        Cat cat = new Cat();
        cat.move(4);

        Dog dog = new Dog();
        dog.move(3);

        //Animal animal = new Animal();

        List lst = new LinkedList();

        cat.abc(lst);
        cat.initialize(lst );
        cat.xyx(lst);

        cat.initialize(new ArrayList());
    }
}
