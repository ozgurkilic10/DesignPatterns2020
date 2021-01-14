package week15;

import java.rmi.RemoteException;

public class GumballMachine implements GumballMachineRemote {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    String location;


    State state;
    int count;

    public GumballMachine(String location, int count) {
        noQuarterState = new NoQuarterSate(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.location = location;
        if (count > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();

    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        dispense();
    }

    public void dispense(){
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("A gumball is rolling out");
        count--;
    }

    public int getCount() {
        return count;
    }

    public String getLocation(){
        return location;
    }

    public State getState() {
        return state;
    }
}
