/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.rmi.Naming;

/**
 *
 * @author dell
 */
public class Client {
    public static void main(String args[]){
        try{
            int port = 7100;
            String lookup_url="rmi://localhost:"+port+"/Constants";
            MathConstants con = (MathConstants)Naming.lookup(lookup_url);
            System.out.println("Area of a circle with radius 3 is: "+ (con.pi()*3*3));
            System.out.println("Euler's Number is: "+con.e());
            System.out.println("Random Number generated on Server: "+con.randomNum());
            System.out.println("Time: "+con.timeConv("2 hour 23 mins"));
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
