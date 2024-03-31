package com.pmshark.d3_final;

public class Test {
    public static final String SCHOOL_NAME = "PMShark"; //常量，一般用大写字母表示，多个单词用下划线分割
    private final String name = "Pig"; //实例成员变量
    public static void main(String[] args) {
        // final的作用
        //3.修饰变量：表示变量只能赋值一次
        //变量：1.局部变量
        //     2.成员变量
                    //（3）.静态成员变量
                    //（2）.实例成员变量
        final int a;
        a = 10;
        //a = 20; //编译报错 原因：final修饰的变量只能赋值一次

        final double PI = 3.14;
        //PI = 3.14159; //编译报错 原因：final修饰的变量只能赋值一次

        final int[] arr = {1, 2, 3};
        //arr = null; //编译报错 原因：final修饰的变量只能赋值一次
        arr[1] = 10; //可以修改数组元素的值

        //schoolName = "PMShark"; //编译报错 原因：final修饰的变量只能赋值一次

        Test t = new Test();
        //t.name = "Dog"; //编译报错 原因：final修饰的变量只能赋值一次
    }

    public static void buy(final double z) {
         //z = 0.1; //编译报错 原因：final修饰的变量只能赋值一次
    }
}

//1.修饰类：表示类不能被继承
final class A {
}
//class B extends A {} //编译报错 原因：final修饰的类不能被继承

//2.修饰方法：表示方法不能被重写
class C {
    public final void test() {
    }
}

class D extends C {
    //@Override
    //public void test() {} //编译报错 原因：final修饰的方法不能被重写
}


