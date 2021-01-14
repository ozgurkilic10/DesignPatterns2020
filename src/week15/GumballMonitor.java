package week15;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gm;

    public GumballMonitor(GumballMachineRemote gm) {
        this.gm = gm;
    }

    public void report() throws RemoteException {
        System.out.println("Gumball Machine : " + gm.getLocation());
        System.out.println("Current Inventory : " + gm.getCount());
        System.out.println("Current state : " + gm.getState());
    }
}
