package com.pmshark.d8_interface2;

public class Test {
    public static void main(String[] args) {
        //使用接口的好处: 1.解决了Java单继承问题 2.接口可以多实现 3.程序可以面向接口编程
        Driver s = new A();
        s.drive();

        Driver d = new A();
        d.drive();
    }
}

class B implements Driver {

    @Override
    public void drive() {

    }
}

class A extends Student implements Driver, Singer{


    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

class Student {

}

interface Driver {
    void drive();

}

interface Singer {
    void sing();

}