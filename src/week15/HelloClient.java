package week15;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {

    public static void main(String... args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost",2001);
        Hello proxy = (Hello) registry.lookup("Hello");
        String response = proxy.sayHello("Ozgur");
        System.out.println(response);
    }
}
