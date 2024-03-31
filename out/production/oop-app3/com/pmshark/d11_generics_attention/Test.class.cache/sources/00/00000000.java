package com.pmshark.d11_generics_attention;

import java.util.ArrayList;

/* loaded from: Test.class */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        String rs = list.get(2);
        System.out.println(rs);
    }
}