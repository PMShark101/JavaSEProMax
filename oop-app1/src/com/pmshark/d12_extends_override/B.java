package com.pmshark.d12_extends_override;

public class B extends A{
    //方法的重写
    //申明不变，重新实现
    @Override //注解：重写的方法
    public void print1() {
        System.out.println("222");
    }

    @Override
    public void print2(int a, int b) {
        System.out.println("222222");
    }
}
