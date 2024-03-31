package com.pmshark.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        //对象多态，行为多态
        //1.对象多态
        People people1 = new Student();
        people1.run(); //识别技巧：编译看左边，运行右边
        System.out.println(people1.name); //对于变量：编译看左边，运行左边

        People people2 = new Teacher();
        people2.run();
        System.out.println(people2.name);
    }
}
