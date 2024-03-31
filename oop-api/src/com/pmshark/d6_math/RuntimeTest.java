package com.pmshark.d6_math;

import java.io.IOException;
import java.net.ProxySelector;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1. get the runtime object
        Runtime r = Runtime.getRuntime();

        //2. public static void exit():exit the program
        //r.exit(0); // exit the program with status 0 (usually don't use it)
        System.out.println("------------------------------");

        //3.availableProcessors(r): get the number of processors
        System.out.println(r.availableProcessors());

        //4.totalMemory(): get the total memory
        System.out.println(r.totalMemory() / 1024 / 1024 + "MB");

        //5.freeMemory(): get the free memory
        System.out.println(r.freeMemory() / 1024 / 1024 + "MB");

        //6.exec(): path to the program
        Process p = r.exec("open /System/Applications/Maps.app");
        Thread.sleep(5000); // wait for 5 seconds
        Process c = r.exec("killall Maps");

    }
}
