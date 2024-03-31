package com.pmshark.d5_block;

import java.net.Socket;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);
        System.out.println(Student.number);//静态代码块只执行一次

        System.out.println(Student.schoolName);

        System.out.println("---------------------------------");
        Student s1 = new Student();
        Student s2 = new Student("张三");
        //System.out.println(s1.age);
        //System.out.println(s2.age);


    }
}
