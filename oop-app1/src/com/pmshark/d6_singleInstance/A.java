package com.pmshark.d6_singleInstance;

public class A {

    //饿汉式

    //2.定义一个类变量记住一个类的一个对象
    private static A a = new A();

    //1.必须私有类的构造器
    private A() {

    }

    //3.提供一个公共的方法返回类的对象
    public static A getObject() {
        return a;
    }
}
