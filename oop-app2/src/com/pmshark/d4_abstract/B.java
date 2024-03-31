package com.pmshark.d4_abstract;

public class B extends A { //B类继承A类，必须实现A类的抽象方法,否则B类也必须是抽象类
    @Override
    public void run() {
        System.out.println("B run");
    }

    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
