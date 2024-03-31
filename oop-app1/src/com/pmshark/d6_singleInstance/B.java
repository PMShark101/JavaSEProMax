package com.pmshark.d6_singleInstance;

public class B {
    //懒汉式单例

    //2.声明类的唯一实例，使用private static修饰
    private static B b;

    //1.把类的构造器私有
    private B() {

    }

    //3.定义一个类放大，这个方法要保证第一次调用时才创建一个对象，后面调用时都用这同一个对象返回
    public static B getInstance() {
        if (b == null) {
            System.out.println("第一次调用时才创建一个对象");
            b = new B();
        }
        return b;
    }

}
