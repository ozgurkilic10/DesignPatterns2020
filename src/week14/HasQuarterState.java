package week14;

import java.util.Random;

public class HasQuarterState implements State{
    GumballMachine gm;

    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        gm = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        gm.setState(gm.noQuarterState);
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {

        System.out.println("You turned crunk");
        int winner = random.nextInt(10);
        if ((winner == 0) && (gm.getCount() >1)){
            gm.setState(gm.winnerState);
        }else
            gm.setState(gm.soldState);


    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
