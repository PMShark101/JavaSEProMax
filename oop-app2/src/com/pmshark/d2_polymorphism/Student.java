package com.pmshark.d2_polymorphism;

public class Student extends People {
    @Override
    public void run() {
        System.out.println("Student run fast");
    }

    public void test() {
        System.out.println("Student test");
    }
}
