package com.pmshark.d7_extends;

//子类
public class B extends A {
    public int k;
    //子类可以继承父类的非私有成员
    public void print3() {
        System.out.println(i);
        print1();

        //System.out.println(j); // 编译错误
        //print2(); // 编译错误
    }
}
