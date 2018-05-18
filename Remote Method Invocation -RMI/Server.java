/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author dell
 */
public class Server {
    public static void main(String args[]) throws RemoteException{
        try{
            int port = 7100;
            startRegistry(port);
            MathConstantsImpl con = new MathConstantsImpl();
            String url = "rmi://localhost:"+port+"/Constants";
            Naming.rebind(url,con);
            System.out.println("Server ready.");
        }catch(Exception e){
           System.out.println("Error: "+e); 
        }
    }

    private static void startRegistry(int port) throws RemoteException {
        try{
            Registry registry = LocateRegistry.getRegistry(port);            
            registry.list();
            System.out.println("Found Registry");
        }catch(Exception e){
            System.out.println("Registry not found. Creating Registry....");            
            LocateRegistry.createRegistry(port);            
            System.out.println("New Registry Created");
        }
    }
}
