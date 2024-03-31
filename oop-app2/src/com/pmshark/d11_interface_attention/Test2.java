package com.pmshark.d11_interface_attention;

public class Test2 {
    public static void main(String[] args) {
        Son son = new Son();
        son.run();
    }

    interface I {
        void test1();
    }

    interface J {
        String test1();
    }
//    interface K extends I,J{
//
//    } //原因：接口I和J中的test1方法返回值不一样，所以无法继承

//    class E implements I,J{
//
//    } //原因：接口I和J中的test1方法返回值不一样，所以无法继承

    //一个类继承了父类，实现了接口，父类中的方法和接口中的方法重名，实现类中的方法是重写父类中的方法
}

class Father {
    public void run() {
        System.out.println("Father.run");
    }
}

interface IT {
    default void run() {
        System.out.println("IT.run");
    }
}

class Son extends Father implements IT {

}

interface IT1 {
    default void test() {
        System.out.println("IT1.test");
    }
}

interface IT2 {
    default void test() {
        System.out.println("IT2.test");
    }
}

class N implements IT1, IT2 {
    @Override
    public void test() {
        System.out.println("N.test"); //重写接口中的默认方法
    } //原因：IT1和IT2中的test方法一样，所以无法继承
}


