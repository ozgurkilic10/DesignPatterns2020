package week15;

import java.io.Serializable;

public class SoldState implements State{
    transient GumballMachine gm;

    public SoldState(GumballMachine gumballMachine) {
        gm = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You are too late");
    }

    @Override
    public void turnCrank() {
        System.out.println("You have already turned the crunk");
    }

    @Override
    public void dispense() {
        gm.releaseBall();
        if (gm.getCount() == 0){
            gm.setState(gm.soldOutState);
            System.out.println("Out of gumballs");
        }else{
            gm.setState(gm.noQuarterState);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
