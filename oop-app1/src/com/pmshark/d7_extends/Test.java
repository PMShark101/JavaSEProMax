package com.pmshark.d7_extends;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.i);
        //System.out.println(b.j); // 编译错误
        System.out.println(b.k);

        b.print1();
        //b.print2(); // 编译错误
        b.print3();

    }
}
