package com.pmshark.d2_static_method;

public class Test {
    public static void main(String[] args) {
        //掌握有无static修饰方法的用法
        //1. 有static修饰的方法，可以直接通过类名调用
        Student.printHelloWorld(); //结构：类名.方法名
        Student s = new Student();
        s.printHelloWorld(); //结构：对象名.方法名，不推荐

        //2. 没有static修饰的方法，必须通过对象调用
        s.printPass(); //结构：对象名.方法名
        //Student.printPass(); //编译报错
    }
}
