package com.pmshark.d2_inner_class2;

public class Test {
    public static void main(String[] args) {
        //内部类
        Outer.Inner in = new Outer.Inner(); //结构: 外部类.内部类 变量名 = new 外部类.内部类();
        in.test();
    }
}
