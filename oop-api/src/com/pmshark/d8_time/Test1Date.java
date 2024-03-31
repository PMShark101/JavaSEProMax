package com.pmshark.d8_time;

import java.util.Date;

public class Test1Date {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long time = d1.getTime();
        System.out.println(time);

        time += 2 * 1000;
        Date d2 = new Date(time);
        System.out.println(d2);

        Date d3 = new Date(0);
        d3.setTime(time);
        System.out.println(d3);


    }
}
