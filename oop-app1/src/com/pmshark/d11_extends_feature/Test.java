package com.pmshark.d11_extends_feature;

public class Test {
    public static void main(String[] args) {
        //1.Java是单继承的，一个类只能继承一个父类
        //2.Object是所有类的父类
        A a = new A();

        B b = new B();


    }
}

class A extends Object{}

class B extends A{}

//class C extends A, B {} //报错原因：Java是单继承的，一个类只能继承一个父类
class D extends B{} //支持多层继承

