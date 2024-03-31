package com.pmshark.d9_modifer;

public class Fu {
    // 1. private修饰的属性，只能在本类中访问
    private void privateMethod() {
        System.out.println("privateMethod");
    }

    // 2. 默认修饰符修饰的属性，只能在本类和同包下的类中访问
    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    // 3. protected修饰的属性，只能在本类、同包下的类和不同包的子类中访问
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    // 4. public修饰的属性，只能在本类、同包下的类、不同包的子类和不同包的类中访问
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public void test() { // 在同一个类中，可以访问所有修饰符修饰的属性
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }



}
