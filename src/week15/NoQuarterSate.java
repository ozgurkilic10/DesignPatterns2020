package week15;

public class NoQuarterSate implements State {
    transient GumballMachine gm;

    public NoQuarterSate(GumballMachine gumballMachine) {
        gm = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gm.setState(gm.hasQuarterState);
        System.out.println("Quarter has been inserted!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You have to pay first");
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
