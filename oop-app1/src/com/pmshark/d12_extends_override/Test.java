package com.pmshark.d12_extends_override;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //方法的重写
        B b = new B();
        b.print1();
        b.print2(1, 2);

        System.out.println("-------------------------");
        Student s = new Student("张三", 18);
        //System.out.println(s.toString());
        System.out.println(s);

        ArrayList list = new ArrayList();
        list.add("java");
        System.out.println(list);
    }
}
