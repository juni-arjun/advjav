import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            Registry registry = LocateRegistry.getRegistry("localhost", 5000);
            Adder stub = (Adder) registry.lookup("HiService");
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Response: " + stub.add(x,y));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
