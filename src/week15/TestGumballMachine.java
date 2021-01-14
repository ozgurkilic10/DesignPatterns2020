package week15;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TestGumballMachine {

    public static void main(String... args) throws RemoteException, AlreadyBoundException {


        GumballMachine server = new GumballMachine("Mugla",30);
        GumballMachineRemote stub = (GumballMachineRemote) UnicastRemoteObject.exportObject(server,0);

        Registry registry = LocateRegistry.getRegistry(2001);
        registry.bind("GM",stub);
        System.out.println("GM ready");

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
