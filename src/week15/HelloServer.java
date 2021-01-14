package week15;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer implements Hello{
    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello" + name;
    }

    public static void main(String... args) throws RemoteException, AlreadyBoundException {
        HelloServer server = new HelloServer();
        Hello stub = (Hello) UnicastRemoteObject.exportObject(server,0);

        Registry registry = LocateRegistry.getRegistry(2001);
        registry.bind("Hello",stub);
        System.out.println("Server ready");
    }
}
