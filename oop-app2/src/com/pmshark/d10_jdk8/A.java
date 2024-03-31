package com.pmshark.d10_jdk8;

public interface A {
    //1.默认方法: 必须使用default修饰, 默认会被public修饰
    //实例方法：对象的方法，必须使用实现类的对象来访问
    default void test1() {
        System.out.println("A接口中的默认方法test1");
    }

    /**
     * 2.私有方法：必须使用private修饰，只能在接口内部使用(jdk9之后支持)
     * */
    private void test2() {
        System.out.println("A接口中的私有方法test2");
    }

    //3.静态方法：必须使用static修饰，默认会被public修饰
    static void test3() {
        System.out.println("A接口中的静态方法test3");
    }

    void test4();
    void test5();
    default void test6() {
        System.out.println("A接口中的默认方法test6");
    }
}
