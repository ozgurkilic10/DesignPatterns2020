package week15;

public class WinnerState implements State {
    transient GumballMachine gm;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("You're the winner");
        gm.releaseBall();
        if (gm.getCount() == 0){
            System.out.println("Out of gumballs");
            gm.setState(gm.soldOutState);
        }else{
            gm.releaseBall();
            if (gm.getCount() == 0) {
                System.out.println("Out of gumballs");
                gm.setState(gm.soldOutState);
            }else{
                gm.setState(gm.noQuarterState);
            }
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
