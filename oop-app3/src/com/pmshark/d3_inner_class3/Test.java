package com.pmshark.d3_inner_class3;

public class Test {
    public static void main(String[] args) {
        //匿名内部类
//        Animal a = new cat();
//        a.cry();

        //1.把这个匿名内部类编译成一个子类，然后立即创建一个子类对象出来
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}

//class cat extends Animal {
//
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}

abstract class Animal {
    public abstract void cry();

}
