package week14;

public class SoldOutState implements State{
    GumballMachine gm;

    public SoldOutState(GumballMachine gumballMachine) {
        gm = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Out of Gumball, Can not accept quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You haven't inserted a quarter, and there is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
