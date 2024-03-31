package com.pmshark.d13_extends_visit;

public class Son extends Father {
    String name = "Son";

    public void showName() {
        String name = "局部名称";
        System.out.println(name); // 局部名称
        System.out.println(this.name); // son
        System.out.println(super.name); // father, super的作用：访问父类的成员


    }

    @Override
    public void print1() {
        System.out.println("Son.print1()");
    }

    public void showMethod() {
        print1(); // Son.print1()
        super.print1(); // Father.print1()
    }
}
