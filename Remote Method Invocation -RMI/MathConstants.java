/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import java.rmi.*;
/**
 *
 * @author dell
 */
public interface MathConstants extends Remote {
    public double pi() throws RemoteException;
    public double e() throws RemoteException;
    public double randomNum() throws RemoteException;
    public int timeConv(String string1) throws RemoteException;
}