package week15;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TestGumballMonitor {

    public static void main(String... args) throws RemoteException, AlreadyBoundException, NotBoundException {


        Registry registry = LocateRegistry.getRegistry("localhost",2001);
        GumballMachineRemote proxy = (GumballMachineRemote) registry.lookup("GM");

        GumballMonitor monitor = new GumballMonitor(proxy);
        monitor.report();

        /*GumballMachine gm = new GumballMachine("MSKU",20);

        GumballMonitor monitor = new GumballMonitor(gm);
        gm.insertQuarter();
        gm.turnCrank();
        monitor.report();
*/
       /* gm.turnCrank();


        gm.insertQuarter();
        gm.ejectQuarter();

        for (int i = 0; i <20; i++) {
            gm.insertQuarter();
            gm.turnCrank();
        }


        gm.insertQuarter();*/

    }
}
