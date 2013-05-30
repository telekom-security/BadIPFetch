package org.metams.badipfetch.test;

import org.metams.badipfetch.Redis;

/**
 * Created by flake on 5/30/13.
 */
public class TestMe
{


    /**
     * main code for the startup / test class
     * @param args
     */
    public static void main(String[] args)
    {
        Redis x = new Redis();
        if (!x.open())
        {
            System.out.println("Error: Unable to connect to Redis database....");
            System.exit(0);
        }

        x.setIP("192.168.1.1", true);

        boolean xTrue = x.checkKnownIP("192.168.1.1");
        boolean xFalse = x.checkKnownIP("192.168.1.2");

        int test = 1;


    }
}