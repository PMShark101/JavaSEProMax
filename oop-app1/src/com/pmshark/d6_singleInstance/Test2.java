package com.pmshark.d6_singleInstance;

public class Test2 {
    public static void main(String[] args) {
        B b1 = B.getInstance(); //第一次调用时才创建一个对象
        B b2 = B.getInstance(); //后面调用时都用这同一个对象返回
        System.out.println(b1 == b2); //true


    }
}
