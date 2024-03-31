package com.pmshark.d10_jdk8;

public class Test {
    public static void main(String[] args) {
        //接口新增的三种方法形式
        B b = new B();
        b.test1();
        //b.test2(); //编译报错
        A.test3();
        b.test6();

    }
}
