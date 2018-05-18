/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author dell
 */
public class MathConstantsImpl extends UnicastRemoteObject implements MathConstants {

    MathConstantsImpl() throws RemoteException {
        super();
    }

    public double pi() {
        return 3.141592653589;
    }

    public double e() {
        return 2.71828182845904;
    }

    public double randomNum() {
        return Math.random();
    }

    public int timeConv(String string1) {
        String string = string1;
        String[] split = string.split("\\s+");
        int le = split.length;
        int v[] = new int[le];
        int t = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].matches("-?\\d+(\\.\\d+)?")) {
                v[t] = Integer.parseInt(split[i]);
                t++;
            }
        }
        int time = 0;
        if (t == 2) {
            time = v[0] * 60 + v[1];
        } else {
            time = v[0];
        }
        return time;
    }
}
