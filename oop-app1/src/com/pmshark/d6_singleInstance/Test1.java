package com.pmshark.d6_singleInstance;

public class Test1 {
    public static void main(String[] args) {
        //单例设计模式的写法
        //作用：保证一个类只有一个对象
        //应用场景：windows的任务管理器，回收站，打印机等
        //new A(); //编译错误，因为构造器是私有的
        A a1 = A.getObject(); //address: 1163157884
        A a2 = A.getObject(); //address: 1163157884 说明a1和a2是同一个对象
        

    }
}
