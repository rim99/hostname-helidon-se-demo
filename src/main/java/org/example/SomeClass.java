package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SomeClass {
    public static String addr;

    static {
        try {
            addr = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            addr = e.toString();
        }
    }
}
