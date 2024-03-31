package com.pmshark.d2_api_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Object creation

        String s1 = null;
        String s2 = "Hello";

        //System.out.println(s1.equals(s2)); //NullPointerException
        System.out.println(Objects.equals(s1, s2)); // Objects advantage is it can handle null values

        System.out.println(Objects.isNull(s1)); //true
        System.out.println(s1 == null); //true
        System.out.println(Objects.isNull(s2)); //false
        System.out.println(s2 == null); //false

        System.out.println(Objects.nonNull(s1)); //false
        System.out.println(Objects.nonNull(s2)); //true

    }
}
