package com.pmshark.d7_interface;

import com.pmshark.d4_abstract.B;

public class Test {
    public static void main(String[] args) {
        //认识接口
        System.out.println(A.SCHOOL_NAME);

        //A a = new A(); // 编译错误，接口不能实例化
        D d = new D();
        d.testB1();
        d.testB2();
        d.testC1();
        d.testC2();
    }
}
