package com.pmshark.d5_enum;

public class Test {
    public static void main(String[] args) {
        //枚举
        A a1 = A.X;
        System.out.println(a1);

        //枚举类的构造器是私有的
        //A a = new A();

        //枚举类的第一行是常量，记住的是枚举类的对象
        A a2 = A.Y;

        //枚举类提供一个额外的API
        A[] as = A.values(); //返回所有的枚举值
        a2.getName();
        A a3 = A.valueOf("Z"); //根据枚举值的名字返回枚举值
        System.out.println(a3.name()); //返回枚举值的名字
        System.out.println(a3.ordinal()); //返回枚举值的序号

        System.out.println("----------------------");

        B y = B.Y;
        y.go();

    }
}
