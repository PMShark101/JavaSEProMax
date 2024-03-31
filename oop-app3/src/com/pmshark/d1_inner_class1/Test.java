package com.pmshark.d1_inner_class1;

public class Test {
    public static void main(String[] args) {
        //内部类
        Outer.Inner in = new Outer().new Inner(); //先把外部类实例化，再实例化内部类
        in.test();
        
    }

}
