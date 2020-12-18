package week11X;

import week11.Coffee;
import week11.Tea;

public class Test {

    public static void main(String... args){
        System.out.println("====Tea Recipe====");
        Tea tea = new Tea();
        tea.prepareRecipe();
        System.out.println("====Coffee Recipe====");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
