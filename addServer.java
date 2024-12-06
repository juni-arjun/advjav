import java.rmi.*;
import java.rmi.registry.*;
public class addServer {
    public static void main(String[] args){
        try{
            Adder stub = new AdderRemote();
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("HiService", stub);
            System.out.println("Server ready");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
