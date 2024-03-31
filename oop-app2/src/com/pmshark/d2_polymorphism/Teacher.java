package com.pmshark.d2_polymorphism;

public class Teacher extends People {
    public String name = "Son Teacher's name";

    @Override
    public void run() {
        System.out.println("Teacher run slow");
    }

    public void teach() {
        System.out.println("Teacher teach");
    }

}
