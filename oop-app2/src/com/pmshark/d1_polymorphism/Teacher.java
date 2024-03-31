package com.pmshark.d1_polymorphism;

public class Teacher extends People{
    public String name = "Son Teacher's name";

    @Override
    public void run() {
        System.out.println("Teacher run slow");

    }
}
