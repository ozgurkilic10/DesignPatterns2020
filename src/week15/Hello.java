package week15;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    public String sayHello(String name) throws RemoteException;
}
