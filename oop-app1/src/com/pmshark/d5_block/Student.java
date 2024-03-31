package com.pmshark.d5_block;

public class Student {
    static int number = 80;
    static String schoolName;
    static {
        System.out.println("静态代码块执行了");
        schoolName = "清华大学";
    }

    int age;

    //实例代码块
    {
        System.out.println("实例代码块执行了"); //每次创建对象都会执行
        //作用：可以将所有对象共有的初始化代码放到一起，提高代码的复用性
        //age = 20;
        System.out.println("有人创建了对象：" + this);
    }

    public Student() {
        System.out.println("无参数构造器执行了");
        //System.out.println("有人创建了对象：" + this);
    }

    public Student(String name) {
        System.out.println("有参数构造器执行了");
        //System.out.println("有人创建了对象：" + this);
    }
}
