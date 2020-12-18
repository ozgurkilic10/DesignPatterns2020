package week10;

import java.util.*;

public class TestIteratorEnumeration {

    public static void main(String... args){

        List<String> strs = new ArrayList<>();

        strs.add("Hello");
        strs.add("World");


        for (String str: strs){
            System.out.println(str);
        }


        Iterator<String> itr = strs.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }



        Vector<String> elements = new Vector<>();
        elements.add("Hi");
        elements.add("Mars");

        Enumeration<String> enumeration = elements.elements();
        while (enumeration.hasMoreElements()){
            String str = enumeration.nextElement();
            System.out.println(str);
        }


    }
}
