package com.pmshark.d4_abstract;

public abstract class A {
    private String name;
    public static String schoolName;

    public A() {
    }

    public A(String name) {
        this.name = name;
    }

    //public abstract void run() {} //错误，抽象方法不能有方法体
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
