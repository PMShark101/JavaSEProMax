package com.pmshark.d4_attention;

import javax.swing.text.Style;

public class Student {
    static String schoolName;
    double score;

    //类方法
    public static void printHelloWorld() {
        Student.schoolName = "PMShark";
        printHelloWorld();//可以直接调用类方法
        //System.out.println(score);//(报错！)不能直接调用实例变量
        //printPass();//(报错！)不能直接调用实例方法
        //System.out.println(this);//(报错！)不能直接访问this
    }

    //实例方法
    public void printHelloWorld2() {

    }

    //实例方法中既可以直接访问类方法，也可以调用实例方法
    public void printPass() {
        schoolName = "PMShark2";
        printHelloWorld2();//可以直接调用实例方法

        System.out.println(score);//可以直接调用实例变量
        printPass2();
        System.out.println(this);//可以直接访问this
    }

    public void printPass2() {
        printPass();//可以直接调用实例方法
    }
}
