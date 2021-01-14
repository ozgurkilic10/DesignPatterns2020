package week14;

public class GumballMachine {

    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;


    State state;
    int count;

    public GumballMachine(int count) {
        noQuarterState = new NoQuarterSate(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = count;
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
}
