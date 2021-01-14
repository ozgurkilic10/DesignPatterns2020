package week13;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())
            return false;
        Iterator itr = (Iterator) stack.peek();
        if (!itr.hasNext()){
            stack.pop();
            return hasNext();
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator itr = (Iterator) stack.peek();
            MenuComponent mc = (MenuComponent) itr.next();
            if (mc instanceof Menu){
                stack.push(mc.createIterator());
            }
            return mc;

        }else{
            return null;
        }
    }
}
