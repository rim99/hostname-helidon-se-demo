package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {

    public static void main(String[] args) {
        System.out.println("===========");
        String addrStatic = SomeClass.addr;
        System.out.println("addrStatic: " + addrStatic);
        String addrRuntime = null;
        try {
            addrRuntime = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            addrRuntime = e.toString();
        }
        System.out.println("addrRuntime: " + addrRuntime);
        System.out.println("===========");
    }
    
}
