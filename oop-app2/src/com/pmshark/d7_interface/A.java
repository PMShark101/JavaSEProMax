package com.pmshark.d7_interface;

public interface A {
    //传统接口只能有成员变量和抽象方法
    //成员变量
    //接口中的成员变量默认是public static final类型
    String SCHOOL_NAME = "PMShark";

    //成员方法(抽象方法)
    //接口中的成员方法默认是public abstract类型
    void test();

    //public A; // 编译错误，接口不能有构造方法
    //static {} //接口中不能有静态代码块
    //{} //接口中不能有代码块

}
