package com.pmshark.d6_math;

public class SystemTest {
    public static void main(String[] args) {
        //1.exit: exit the program
        //System.exit(0); // exit the program with status 0 (usually don't use it)
        System.out.println("------------------------------");

        //2.currentTimeMillis: current time in milliseconds
        long time = System.currentTimeMillis();
        System.out.println(time); // from 1970-01-01 00:00:00 to now

        for (int i = 0; i < 1000000; i++) {
            System.out.println("Print" + i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time) / 1000.0 + "s"); // time to print 1000000 lines, the way to measure performance
    }
}
