package com.pmshark.d10_modifer;

import com.pmshark.d9_modifer.Fu;

public class Demo2 {
    public static void main(String[] args) {
        //不同权限修饰符的作用
        Fu f = new Fu();
        //f.privateMethod(); //私有方法，只能在本类中访问
        //f.defaultMethod(); //默认方法，只能在本包中访问
        //f.protectedMethod(); //受保护方法，只能在本包中访问
        f.publicMethod(); //公共方法，任何地方都可以访问

        Son s = new Son();
        //s.protectedMethod(); //受保护方法，只能在本包中访问
    }
}
