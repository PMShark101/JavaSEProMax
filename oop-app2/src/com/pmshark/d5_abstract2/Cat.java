package com.pmshark.d5_abstract2;

public class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println(getName() + " Meow Meow");
    }
}
