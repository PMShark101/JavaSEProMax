package com.pmshark.d10_modifer;

import com.pmshark.d9_modifer.Fu;

public class Son extends Fu {
    public void test() {
        //privateMethod(); //私有方法，只能在本类中访问
        //defaultMethod(); //默认方法，只能在本包中访问
        protectedMethod(); //受保护方法，只能在本包中访问
        publicMethod(); //公共方法，任何地方都可以访问
    }
}
