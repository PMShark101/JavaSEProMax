package com.pmshark.d13_extends_visit;

public class Test {
    //子类访问其他成员的特点：就近原则
    public static void main(String[] args) {
        Son son = new Son();
        son.showName(); // 局部名称
        son.showMethod(); // Son.print1()

    }
}
